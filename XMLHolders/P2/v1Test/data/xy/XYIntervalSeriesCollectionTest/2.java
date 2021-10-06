@Test
    public void testPublicCloneable() {
        XYIntervalSeriesCollection c1 = new XYIntervalSeriesCollection();
        assertTrue(c1 instanceof PublicCloneable);
    }

    