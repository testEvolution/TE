@Test
    public void testHashCode() {
        TextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0);
        TextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0);
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    