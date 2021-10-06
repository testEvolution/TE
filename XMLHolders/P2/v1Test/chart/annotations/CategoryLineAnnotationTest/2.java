@Test
    public void testCloning() throws CloneNotSupportedException {
        CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 
                1.0, "Category 2", 2.0, Color.RED, new BasicStroke(1.0f));
        CategoryLineAnnotation a2 = (CategoryLineAnnotation) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    