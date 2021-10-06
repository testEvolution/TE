@Test
    public void testSerialization() {
        StandardXYSeriesLabelGenerator g1
                = new StandardXYSeriesLabelGenerator("Series {0}");
        StandardXYSeriesLabelGenerator g2 = (StandardXYSeriesLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }
}