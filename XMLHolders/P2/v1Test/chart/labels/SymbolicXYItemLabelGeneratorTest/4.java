@Test
    public void testSerialization() {
        SymbolicXYItemLabelGenerator g1 = new SymbolicXYItemLabelGenerator();
        SymbolicXYItemLabelGenerator g2 = (SymbolicXYItemLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}