@Test
    public void testCloning() throws CloneNotSupportedException {
        CategoryPointerAnnotation a1 = new CategoryPointerAnnotation("Label",
                "A", 20.0, Math.PI);
        CategoryPointerAnnotation a2 = (CategoryPointerAnnotation) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    