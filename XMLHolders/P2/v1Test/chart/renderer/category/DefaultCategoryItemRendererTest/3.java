@Test
    public void testPublicCloneable() {
        DefaultCategoryItemRenderer r1 = new DefaultCategoryItemRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    