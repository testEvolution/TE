@Test
    public void testPublicCloneable() {
        VectorSeriesCollection d1 = new VectorSeriesCollection();
        assertTrue(d1 instanceof PublicCloneable);
    }

    