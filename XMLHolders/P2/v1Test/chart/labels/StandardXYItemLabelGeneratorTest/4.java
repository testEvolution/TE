@Test
    public void testSerialization() {
        StandardXYItemLabelGenerator g1 = new StandardXYItemLabelGenerator();
        StandardXYItemLabelGenerator g2 = (StandardXYItemLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}