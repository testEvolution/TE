@Test
    public void testSerialization3() {

        XYSeriesCollection dataset = new XYSeriesCollection();
        JFreeChart chart = ChartFactory.createXYLineChart("Test Chart",
                "Domain Axis", "Range Axis", dataset);
        JFreeChart chart2 = (JFreeChart) TestUtils.serialised(chart);
        assertEquals(chart, chart2);
        try {
            chart2.createBufferedImage(300, 200);
        }
        catch (Exception e) {
            fail("No exception should be thrown.");
        }
    }

    