@Test
    public void testSerialization() {
        StandardCategorySeriesLabelGenerator g1
                = new StandardCategorySeriesLabelGenerator("{2}");
        StandardCategorySeriesLabelGenerator g2 = (StandardCategorySeriesLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}