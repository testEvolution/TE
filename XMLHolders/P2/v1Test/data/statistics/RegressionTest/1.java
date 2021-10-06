@Test
    public void testOLSRegression1b() {

        double[][] data = createSampleData1();

        XYSeries series = new XYSeries("Test");
        for (int i = 0; i < 11; i++) {
            series.add(data[i][0], data[i][1]);
        }
        XYDataset ds = new XYSeriesCollection(series);
        double[] result2 = Regression.getOLSRegression(ds, 0);

        assertEquals(.25680930, result2[0], 0.0000001);
        assertEquals(0.72792106, result2[1], 0.0000001);

    }

    