@Test
    public void testAccepts() {
        SimpleHistogramBin bin1 = new SimpleHistogramBin(1.0, 2.0);
        assertFalse(bin1.accepts(0.0));
        assertTrue(bin1.accepts(1.0));
        assertTrue(bin1.accepts(1.5));
        assertTrue(bin1.accepts(2.0));
        assertFalse(bin1.accepts(2.1));
        assertFalse(bin1.accepts(Double.NaN));

        SimpleHistogramBin bin2
            = new SimpleHistogramBin(1.0, 2.0, false, false);
        assertFalse(bin2.accepts(0.0));
        assertFalse(bin2.accepts(1.0));
        assertTrue(bin2.accepts(1.5));
        assertFalse(bin2.accepts(2.0));
        assertFalse(bin2.accepts(2.1));
        assertFalse(bin2.accepts(Double.NaN));
    }

    