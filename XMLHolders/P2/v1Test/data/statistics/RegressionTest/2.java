@Test
    public void testPowerRegression1a() {

        double[][] data = createSampleData1();
        double[] result = Regression.getPowerRegression(data);
        assertEquals(0.91045813, result[0], 0.0000001);
        assertEquals(0.88918346, result[1], 0.0000001);

    }

    