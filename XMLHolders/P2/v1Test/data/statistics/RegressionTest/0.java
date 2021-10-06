@Test
    public void testOLSRegression1a() {
        double[][] data = createSampleData1();
        double[] result1 = Regression.getOLSRegression(data);
        assertEquals(.25680930, result1[0], 0.0000001);
        assertEquals(0.72792106, result1[1], 0.0000001);
    }

    