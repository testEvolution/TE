@Test
    public void testSerialization() {
        double start = 10.0;
        double end = 20.0;
        HistogramBin b1 = new HistogramBin(start, end);
        HistogramBin b2 = (HistogramBin) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}