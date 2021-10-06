@Test
    public void testCloning() throws CloneNotSupportedException {
        SimpleHistogramBin b1 = new SimpleHistogramBin(1.1, 2.2, false, true);
        b1.setItemCount(99);
        SimpleHistogramBin b2 = (SimpleHistogramBin) b1.clone();
        assertTrue(b1 != b2);
        assertTrue(b1.getClass() == b2.getClass());
        assertTrue(b1.equals(b2));

        // check that clone is independent of the original
        b2.setItemCount(111);
        assertFalse(b1.equals(b2));
    }

    