@Test
    public void testEquals() {
        double start = 10.0;
        double end = 20.0;
        HistogramBin b1 = new HistogramBin(start, end);
        HistogramBin b2 = new HistogramBin(start, end);
        assertEquals(b1, b2);
    }

    