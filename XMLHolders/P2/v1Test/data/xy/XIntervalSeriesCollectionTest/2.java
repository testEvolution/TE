@Test
    public void testPublicCloneable() {
        XIntervalSeriesCollection c1 = new XIntervalSeriesCollection();
        assertTrue(c1 instanceof PublicCloneable);
    }

    