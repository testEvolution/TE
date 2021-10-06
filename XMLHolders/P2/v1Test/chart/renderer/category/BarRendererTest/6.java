@Test
    public void testGetLegendItem() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(21.0, "R1", "C1");
        BarRenderer r = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("x"),
                new NumberAxis("y"), r);
        /*JFreeChart chart =*/ new JFreeChart(plot);
        LegendItem li = r.getLegendItem(0, 0);
        assertNotNull(li);
        r.setSeriesVisibleInLegend(0, Boolean.FALSE);
        li = r.getLegendItem(0, 0);
        assertNull(li);
    }

    