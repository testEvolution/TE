@Test
    public void testEquals() {
        double[] values = {1.0, 2.0, 3.0, 4.0, 6.0, 12.0, 5.0, 6.3, 4.5};
        HistogramDataset d1 = new HistogramDataset();
        d1.addSeries("Series 1", values, 5);
        HistogramDataset d2 = new HistogramDataset();
        d2.addSeries("Series 1", values, 5);

        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        d1.addSeries("Series 2", new double[] {1.0, 2.0, 3.0}, 2);
        assertFalse(d1.equals(d2));
        d2.addSeries("Series 2", new double[] {1.0, 2.0, 3.0}, 2);
        assertTrue(d1.equals(d2));
    }

    