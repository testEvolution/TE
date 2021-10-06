@Test
    public void testOLSRegression2a() {

        double[][] data = createSampleData2();
        double[] result = Regression.getOLSRegression(data);
        assertEquals(53.9729697, result[0], 0.0000001);
        assertEquals(-4.1823030, result[1], 0.0000001);

    }

    