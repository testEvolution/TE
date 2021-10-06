@Test
    public void testCloning() throws CloneNotSupportedException {
        double start = 10.0;
        double end = 20.0;
        HistogramBin b1 = new HistogramBin(start, end);
        HistogramBin b2 = (HistogramBin) b1.clone();
        assertTrue(b1 != b2);
        assertTrue(b1.getClass() == b2.getClass());
        assertTrue(b1.equals(b2));
    }

    