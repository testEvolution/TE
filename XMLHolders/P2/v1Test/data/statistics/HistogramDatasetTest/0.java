@Test
    public void testBins() {
        double[] values = {1.0, 2.0, 3.0, 4.0, 6.0, 12.0, 5.0, 6.3, 4.5};
        HistogramDataset hd = new HistogramDataset();
        hd.addSeries("Series 1", values, 5);
        assertEquals(hd.getYValue(0, 0), 3.0, EPSILON);
        assertEquals(hd.getYValue(0, 1), 3.0, EPSILON);
        assertEquals(hd.getYValue(0, 2), 2.0, EPSILON);
        assertEquals(hd.getYValue(0, 3), 0.0, EPSILON);
        assertEquals(hd.getYValue(0, 4), 1.0, EPSILON);
    }

    