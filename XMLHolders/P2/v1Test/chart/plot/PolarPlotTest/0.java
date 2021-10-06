@Test
    public void testGetLegendItems() {
        XYSeriesCollection d = new XYSeriesCollection();
        d.addSeries(new XYSeries("A"));
        d.addSeries(new XYSeries("B"));
        DefaultPolarItemRenderer r = new DefaultPolarItemRenderer();
        PolarPlot plot = new PolarPlot();
        plot.setDataset(d);
        plot.setRenderer(r);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
        LegendItem item1 = items.get(0);
        assertEquals("A", item1.getLabel());
        LegendItem item2 = items.get(1);
        assertEquals("B", item2.getLabel());
    }

    