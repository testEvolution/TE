@Test
    public void testHashCode() {
        SymbolicXYItemLabelGenerator g1
                = new SymbolicXYItemLabelGenerator();
        SymbolicXYItemLabelGenerator g2
                = new SymbolicXYItemLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    