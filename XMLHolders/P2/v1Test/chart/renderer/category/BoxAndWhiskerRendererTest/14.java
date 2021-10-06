@Test
    public void testDrawWithNullMean() {
        boolean success;
        try {
            DefaultBoxAndWhiskerCategoryDataset dataset
                    = new DefaultBoxAndWhiskerCategoryDataset();
            dataset.add(new BoxAndWhiskerItem(null, 2.0, 0.0, 4.0, 0.5, 4.5, 
                    -0.5, 5.5, null), "S1", "C1");
            CategoryPlot plot = new CategoryPlot(dataset,
                    new CategoryAxis("Category"), new NumberAxis("Value"),
                    new BoxAndWhiskerRenderer());
            ChartRenderingInfo info = new ChartRenderingInfo();
            JFreeChart chart = new JFreeChart(plot);
            /* BufferedImage image = */ chart.createBufferedImage(300, 200,
                    info);
            success = true;
        }
        catch (Exception e) {
            success = false;
        }
        assertTrue(success);
    }

    