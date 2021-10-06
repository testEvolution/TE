@Test
    public void testCloning() throws CloneNotSupportedException {
        SimpleHistogramDataset d1 = new SimpleHistogramDataset("Dataset 1");
        SimpleHistogramDataset d2 = (SimpleHistogramDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // check that clone is independent of the original
        d2.addBin(new SimpleHistogramBin(2.0, 3.0));
        d2.addObservation(2.3);
        assertFalse(d1.equals(d2));
    }

    