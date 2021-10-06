@Test
    public void testBinBoundaries() {
        double[] values = {-5.000000000000286E-5};
        int bins = 1260;
        double minimum = -0.06307522528160199;
        double maximum = 0.06297522528160199;
        HistogramDataset d = new HistogramDataset();
        d.addSeries("S1", values, bins, minimum, maximum);
        assertEquals(0.0, d.getYValue(0, 629), EPSILON);
        assertEquals(1.0, d.getYValue(0, 630), EPSILON);
        assertEquals(0.0, d.getYValue(0, 631), EPSILON);
        assertTrue(values[0] > d.getStartXValue(0, 630));
        assertTrue(values[0] < d.getEndXValue(0, 630));
    }

    