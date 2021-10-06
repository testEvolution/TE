@Test
    public void testPublicCloneable() {
        HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    