@Test
    public void testPublicCloneable() {
        DefaultIntervalXYDataset d1 = new DefaultIntervalXYDataset();
        assertTrue(d1 instanceof PublicCloneable);
    }

    