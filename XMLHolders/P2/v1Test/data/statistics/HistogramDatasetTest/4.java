@Test
    public void testGetSeriesKey() {
        double[] values = {1.0, 2.0, 3.0, 4.0, 6.0, 12.0, 5.0, 6.3, 4.5};
        HistogramDataset d1 = new HistogramDataset();
        d1.addSeries("Series 1", values, 5);
        assertEquals("Series 1", d1.getSeriesKey(0));
    }

    