@Test
    public void testClearObservations() {
        SimpleHistogramDataset d1 = new SimpleHistogramDataset("D1");
        d1.clearObservations();
        assertEquals(0, d1.getItemCount(0));
        d1.addBin(new SimpleHistogramBin(0.0, 1.0));
        d1.addObservation(0.5);
        assertEquals(1.0, d1.getYValue(0, 0), EPSILON);
    }

    