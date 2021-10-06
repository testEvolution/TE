@Test
    public void testPowerRegression1b() {

        double[][] data = createSampleData1();

        XYSeries series = new XYSeries("Test");
        for (int i = 0; i < 11; i++) {
            series.add(data[i][0], data[i][1]);
        }
        XYDataset ds = new XYSeriesCollection(series);
        double[] result = Regression.getPowerRegression(ds, 0);

        assertEquals(0.91045813, result[0], 0.0000001);
        assertEquals(0.88918346, result[1], 0.0000001);

    }

    