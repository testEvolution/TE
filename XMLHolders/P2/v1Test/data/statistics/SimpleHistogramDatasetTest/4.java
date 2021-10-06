@Test
    public void testRemoveAllBins() {
        SimpleHistogramDataset d1 = new SimpleHistogramDataset("D1");
        d1.addBin(new SimpleHistogramBin(0.0, 1.0));
        d1.addObservation(0.5);
        d1.addBin(new SimpleHistogramBin(2.0, 3.0));
        assertEquals(2, d1.getItemCount(0));
        d1.removeAllBins();
        assertEquals(0, d1.getItemCount(0));
    }

}