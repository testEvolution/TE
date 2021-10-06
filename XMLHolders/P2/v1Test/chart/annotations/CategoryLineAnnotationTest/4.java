@Test
    public void testSerialization() {
        CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 
                1.0, "Category 2", 2.0, Color.RED, new BasicStroke(1.0f));
        CategoryLineAnnotation a2 = (CategoryLineAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}