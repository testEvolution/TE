@Test
    public void testSerialization() {
        MultipleXYSeriesLabelGenerator g1
                = new MultipleXYSeriesLabelGenerator();
        g1.addSeriesLabel(0, "Add0");
        g1.addSeriesLabel(0, "Add0b");
        g1.addSeriesLabel(1, "Add1");
        MultipleXYSeriesLabelGenerator g2 = (MultipleXYSeriesLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}