@Test
    public void testGetLegendItems2() {
        XYSeriesCollection d1 = new XYSeriesCollection();
        d1.addSeries(new XYSeries("A"));
        d1.addSeries(new XYSeries("B"));
        XYSeriesCollection d2 = new XYSeriesCollection();
        d2.addSeries(new XYSeries("C"));
        d2.addSeries(new XYSeries("D"));
        DefaultPolarItemRenderer r = new DefaultPolarItemRenderer();
        PolarPlot plot = new PolarPlot();
        plot.setDataset(d1);
        plot.setDataset(1, d2);
        plot.setRenderer(r);
        plot.setRenderer(1, new DefaultPolarItemRenderer());
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(4, items.getItemCount());
        LegendItem item1 = items.get(0);
        assertEquals("A", item1.getLabel());
        LegendItem item2 = items.get(1);
        assertEquals("B", item2.getLabel());
        LegendItem item3 = items.get(2);
        assertEquals("C", item3.getLabel());
        LegendItem item4 = items.get(3);
        assertEquals("D", item4.getLabel());
    }

    