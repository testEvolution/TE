@Test
    public void testPublicCloneable() {
        SymbolicXYItemLabelGenerator g1 = new SymbolicXYItemLabelGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    