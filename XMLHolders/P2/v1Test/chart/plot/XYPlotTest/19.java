@Test
    public void testSerialization4() {

        XYSeriesCollection dataset = new XYSeriesCollection();
        JFreeChart chart = ChartFactory.createXYLineChart("Test Chart",
                "Domain Axis", "Range Axis", dataset);
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.addDomainMarker(new ValueMarker(1.0), Layer.FOREGROUND);
        plot.addDomainMarker(new IntervalMarker(2.0, 3.0), Layer.BACKGROUND);
        plot.addRangeMarker(new ValueMarker(4.0), Layer.FOREGROUND);
        plot.addRangeMarker(new IntervalMarker(5.0, 6.0), Layer.BACKGROUND);
        JFreeChart chart2 = (JFreeChart) TestUtils.serialised(chart);
        assertEquals(chart, chart2);
        try {
            chart2.createBufferedImage(300, 200);
        }
        catch (Exception e) {
            fail("No exception should be thrown.");
        }
    }

    