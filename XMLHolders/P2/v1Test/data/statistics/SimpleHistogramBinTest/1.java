@Test
    public void testOverlapsWidth() {
        SimpleHistogramBin b1 = new SimpleHistogramBin(1.0, 2.0);
        SimpleHistogramBin b2 = new SimpleHistogramBin(2.0, 3.0);
        SimpleHistogramBin b3 = new SimpleHistogramBin(3.0, 4.0);
        SimpleHistogramBin b4 = new SimpleHistogramBin(0.0, 5.0);
        SimpleHistogramBin b5 = new SimpleHistogramBin(2.0, 3.0, false, true);
        SimpleHistogramBin b6 = new SimpleHistogramBin(2.0, 3.0, true, false);
        assertTrue(b1.overlapsWith(b2));
        assertTrue(b2.overlapsWith(b1));
        assertFalse(b1.overlapsWith(b3));
        assertFalse(b3.overlapsWith(b1));
        assertTrue(b1.overlapsWith(b4));
        assertTrue(b4.overlapsWith(b1));
        assertFalse(b1.overlapsWith(b5));
        assertFalse(b5.overlapsWith(b1));
        assertTrue(b1.overlapsWith(b6));
        assertTrue(b6.overlapsWith(b1));
    }

    