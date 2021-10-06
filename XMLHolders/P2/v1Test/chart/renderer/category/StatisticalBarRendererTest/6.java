@Test
    public void testDrawWithNullMeanVertical() {
        try {
            DefaultStatisticalCategoryDataset dataset
                    = new DefaultStatisticalCategoryDataset();
            dataset.add(1.0, 2.0, "S1", "C1");
            dataset.add(null, 4.0, "S1", "C2");
            CategoryPlot plot = new CategoryPlot(dataset,
                    new CategoryAxis("Category"), new NumberAxis("Value"),
                    new StatisticalBarRenderer());
            JFreeChart chart = new JFreeChart(plot);
            /* BufferedImage image = */ chart.createBufferedImage(300, 200,
                    null);
        }
        catch (NullPointerException e) {
            fail("No exception should be thrown.");
        }
    }

    