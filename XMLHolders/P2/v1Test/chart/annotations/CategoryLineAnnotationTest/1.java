@Test
    public void testHashcode() {
        CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 
                1.0, "Category 2", 2.0, Color.RED, new BasicStroke(1.0f));
        CategoryLineAnnotation a2 = new CategoryLineAnnotation("Category 1", 
                1.0, "Category 2", 2.0, Color.RED, new BasicStroke(1.0f));
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    