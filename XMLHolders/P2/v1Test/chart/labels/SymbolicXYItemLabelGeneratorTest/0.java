@Test
    public void testEquals() {
        SymbolicXYItemLabelGenerator g1 = new SymbolicXYItemLabelGenerator();
        SymbolicXYItemLabelGenerator g2 = new SymbolicXYItemLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));
    }

    