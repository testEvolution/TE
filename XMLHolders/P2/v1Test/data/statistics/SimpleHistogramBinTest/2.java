@Test
    public void testEquals() {
        SimpleHistogramBin b1 = new SimpleHistogramBin(1.0, 2.0);
        SimpleHistogramBin b2 = new SimpleHistogramBin(1.0, 2.0);
        assertTrue(b1.equals(b2));
        assertTrue(b2.equals(b1));

        b1 = new SimpleHistogramBin(1.1, 2.0, true, true);
        assertFalse(b1.equals(b2));
        b2 = new SimpleHistogramBin(1.1, 2.0, true, true);
        assertTrue(b1.equals(b2));

        b1 = new SimpleHistogramBin(1.1, 2.2, true, true);
        assertFalse(b1.equals(b2));
        b2 = new SimpleHistogramBin(1.1, 2.2, true, true);
        assertTrue(b1.equals(b2));

        b1 = new SimpleHistogramBin(1.1, 2.2, false, true);
        assertFalse(b1.equals(b2));
        b2 = new SimpleHistogramBin(1.1, 2.2, false, true);
        assertTrue(b1.equals(b2));

        b1 = new SimpleHistogramBin(1.1, 2.2, false, false);
        assertFalse(b1.equals(b2));
        b2 = new SimpleHistogramBin(1.1, 2.2, false, false);
        assertTrue(b1.equals(b2));

        b1.setItemCount(99);
        assertFalse(b1.equals(b2));
        b2.setItemCount(99);
        assertTrue(b1.equals(b2));
    }

    