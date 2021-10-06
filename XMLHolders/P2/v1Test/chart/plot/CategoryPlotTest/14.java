@Test
    public void testSerialization3() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart(
                "Test Chart", "Category Axis", "Value Axis", dataset,
                PlotOrientation.VERTICAL, true, true, false);
        JFreeChart chart2 = (JFreeChart) TestUtils.serialised(chart);

        // now check that the chart is usable...
        try {
            chart2.createBufferedImage(300, 200);
        }
        catch (Exception e) {
            fail("No exception should be thrown.");
        }
    }

    