@Test
    public void testPublicCloneable() {
        CustomCategoryURLGenerator g1 = new CustomCategoryURLGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    