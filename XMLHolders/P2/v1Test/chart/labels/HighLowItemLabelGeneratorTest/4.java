@Test
    public void testSerialization() {
        HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator();
        HighLowItemLabelGenerator g2 = (HighLowItemLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}