@Test
    public void testNotification() {
        CombinedRangeXYPlot plot = createPlot();
        JFreeChart chart = new JFreeChart(plot);
        chart.addChangeListener(this);
        XYPlot subplot1 = (XYPlot) plot.getSubplots().get(0);
        NumberAxis xAxis = (NumberAxis) subplot1.getDomainAxis();
        xAxis.setAutoRangeIncludesZero(!xAxis.getAutoRangeIncludesZero());
        assertEquals(1, this.events.size());

        // a redraw should NOT trigger another change event
        BufferedImage image = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        this.events.clear();
        chart.draw(g2, new Rectangle2D.Double(0.0, 0.0, 200.0, 100.0));
        assertTrue(this.events.isEmpty());
    }

    