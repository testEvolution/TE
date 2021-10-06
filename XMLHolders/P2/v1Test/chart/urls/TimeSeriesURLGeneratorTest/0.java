@Test
    public void testGenerateURL() {
        TimeSeriesURLGenerator g = new TimeSeriesURLGenerator();
        DefaultXYDataset dataset = new DefaultXYDataset();
        dataset.addSeries("Series '1'", new double[][] {{1.0, 2.0},
                {3.0, 4.0}});
        String s = g.generateURL(dataset, 0, 0);
        assertTrue(s.startsWith("index.html?series=Series+%271%27&amp;item="));
    }

    