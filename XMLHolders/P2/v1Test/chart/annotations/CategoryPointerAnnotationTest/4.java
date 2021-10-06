@Test
    public void testSerialization() {
        CategoryPointerAnnotation a1 = new CategoryPointerAnnotation("Label",
                "A", 20.0, Math.PI);
        CategoryPointerAnnotation a2 = (CategoryPointerAnnotation) 
                TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}