@Test
    public void testSerialization() {
        CategoryLabelWidthType w1 = CategoryLabelWidthType.RANGE;
        CategoryLabelWidthType w2 = (CategoryLabelWidthType) TestUtils.serialised(w1);
        assertEquals(w1, w2);
        assertTrue(w1 == w2);
    }

}