@Test
    public void test1553088() {
        double[] values = {-1.0, 0.0, -Double.MIN_VALUE, 3.0};
        HistogramDataset d = new HistogramDataset();
        d.addSeries("S1", values, 2, -1.0, 0.0);
        assertEquals(-1.0, d.getStartXValue(0, 0), EPSILON);
        assertEquals(-0.5, d.getEndXValue(0, 0), EPSILON);
        assertEquals(1.0, d.getYValue(0, 0), EPSILON);

        assertEquals(-0.5, d.getStartXValue(0, 1), EPSILON);
        assertEquals(0.0, d.getEndXValue(0, 1), EPSILON);
        assertEquals(3.0, d.getYValue(0, 1), EPSILON);
    }

    