@Test
    public void testPublicCloneable() {
        YIntervalSeriesCollection c1 = new YIntervalSeriesCollection();
        assertTrue(c1 instanceof PublicCloneable);
    }

    