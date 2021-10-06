@Test
    public void testEquals() {
        SimpleHistogramDataset d1 = new SimpleHistogramDataset("Dataset 1");
        SimpleHistogramDataset d2 = new SimpleHistogramDataset("Dataset 1");
        assertTrue(d1.equals(d2));

        d1.addBin(new SimpleHistogramBin(1.0, 2.0));
        assertFalse(d1.equals(d2));
        d2.addBin(new SimpleHistogramBin(1.0, 2.0));
        assertTrue(d1.equals(d2));
    }

    