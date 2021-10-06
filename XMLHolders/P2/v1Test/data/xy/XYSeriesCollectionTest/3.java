@Test
    public void testPublicCloneable() {
        Object c1 = new XYSeriesCollection();
        assertTrue(c1 instanceof PublicCloneable);
    }

    