@Test
    public void testGetLegendItems() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Item 1", 1.0);
        dataset.setValue("Item 2", 2.0);
        dataset.setValue("Item 3", 0.0);
        dataset.setValue("Item 4", null);

        PiePlot plot = new PiePlot(dataset);
        plot.setIgnoreNullValues(false);
        plot.setIgnoreZeroValues(false);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(4, items.getItemCount());

        // check that null items are ignored if requested
        plot.setIgnoreNullValues(true);
        items = plot.getLegendItems();
        assertEquals(3, items.getItemCount());

        // check that zero items are ignored if requested
        plot.setIgnoreZeroValues(true);
        items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());

        // check that negative items are always ignored
        dataset.setValue("Item 5", -1.0);
        items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
    }

    