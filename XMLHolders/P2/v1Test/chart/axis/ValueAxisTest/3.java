@Test
    public void test3555275() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createLineChart("Title", "X", "Y",
                dataset, PlotOrientation.VERTICAL, true, false, false);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setInsets(RectangleInsets.ZERO_INSETS);
        plot.setAxisOffset(RectangleInsets.ZERO_INSETS);
        ValueAxis yAxis = plot.getRangeAxis();
        yAxis.setFixedDimension(100.0);
        BufferedImage image = new BufferedImage(500, 300, 
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        ChartRenderingInfo info = new ChartRenderingInfo();
        chart.draw(g2, new Rectangle2D.Double(0, 0, 500, 300), info);
        g2.dispose();
        Rectangle2D rect = info.getPlotInfo().getDataArea();
        double x = rect.getMinX();
        assertEquals(100.0, x, 1.0);
    }

}