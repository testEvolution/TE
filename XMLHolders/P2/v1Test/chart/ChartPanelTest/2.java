@Test
    public void testSetChart() {
        JFreeChart chart = new JFreeChart(new XYPlot());
        ChartPanel panel = new ChartPanel(chart);
        panel.setChart(null);
        assertEquals(null, panel.getChart());
    }

    