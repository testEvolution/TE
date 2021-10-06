@Test
    public void testPublicCloneable() {
        MultipleXYSeriesLabelGenerator g1
                = new MultipleXYSeriesLabelGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    