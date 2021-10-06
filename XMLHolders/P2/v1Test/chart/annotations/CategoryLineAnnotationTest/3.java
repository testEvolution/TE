@Test
    public void testPublicCloneable() {
        CategoryLineAnnotation a1 = new CategoryLineAnnotation(
                "Category 1", 1.0, "Category 2", 2.0, Color.RED,
                new BasicStroke(1.0f));
        assertTrue(a1 instanceof PublicCloneable);
    }

    