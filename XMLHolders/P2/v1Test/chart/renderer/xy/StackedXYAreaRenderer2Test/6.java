@Test
    public void testFindRangeBounds() {
        TableXYDataset dataset
                = RendererXYPackageUtils.createTestTableXYDataset();
        JFreeChart chart = ChartFactory.createStackedXYAreaChart(
                "Test Chart", "X", "Y", dataset, PlotOrientation.VERTICAL,
                false, false, false);
        XYPlot plot = (XYPlot) chart.getPlot();
        StackedXYAreaRenderer2 renderer = new StackedXYAreaRenderer2();
        plot.setRenderer(renderer);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        Range bounds = rangeAxis.getRange();
        assertTrue(bounds.contains(6.0));
        assertTrue(bounds.contains(8.0));

        // try null argument
        assertNull(renderer.findRangeBounds(null));

        // try empty dataset
        assertNull(renderer.findRangeBounds(new DefaultTableXYDataset()));
    }

}