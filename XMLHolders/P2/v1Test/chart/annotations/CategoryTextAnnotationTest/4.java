@Test
    public void testSerialization() {
        CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", 
                "Category", 1.0);
        CategoryTextAnnotation a2 = (CategoryTextAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}