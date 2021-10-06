@Test
    public void testPowerRegression2b() {

        double[][] data = createSampleData2();

        XYSeries series = new XYSeries("Test");
        for (int i = 0; i < 10; i++) {
            series.add(data[i][0], data[i][1]);
        }
        XYDataset ds = new XYSeriesCollection(series);
        double[] result = Regression.getPowerRegression(ds, 0);

        assertEquals(106.1241681, result[0], 0.0000001);
        assertEquals(-0.8466615, result[1], 0.0000001);

    }

    