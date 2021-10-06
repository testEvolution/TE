@Test
    public void testPublicCloneable() {
        DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1",
                new Date[0], new double[0], new double[0], new double[0],
                new double[0], new double[0]);
        assertTrue(d1 instanceof PublicCloneable);
    }

    