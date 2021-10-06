@Test
    public void testLegendEvents() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        JFreeChart chart = ChartFactory.createPieChart("title", dataset);
        chart.addChangeListener(this);
        this.lastChartChangeEvent = null;
        LegendTitle legend = chart.getLegend();
        legend.setPosition(RectangleEdge.TOP);
        assertNotNull(this.lastChartChangeEvent);
    }

    