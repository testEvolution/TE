@Test
    public void testPublicCloneable() {
        CategoryPointerAnnotation a1 = new CategoryPointerAnnotation("Label",
                "A", 20.0, Math.PI);
        assertTrue(a1 instanceof PublicCloneable);
    }

    