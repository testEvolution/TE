@Test
    public void testSerialization() {
        StandardPieSectionLabelGenerator g1
                = new StandardPieSectionLabelGenerator();
        StandardPieSectionLabelGenerator g2 = (StandardPieSectionLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}