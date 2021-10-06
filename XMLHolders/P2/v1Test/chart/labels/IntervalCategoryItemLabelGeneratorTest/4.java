@Test
    public void testSerialization() {
        IntervalCategoryItemLabelGenerator g1
                = new IntervalCategoryItemLabelGenerator("{3} - {4}",
                DateFormat.getInstance());
        IntervalCategoryItemLabelGenerator g2 = (IntervalCategoryItemLabelGenerator) TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}