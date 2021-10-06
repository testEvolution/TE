@Test
    public void testPublicCloneable() {
        StandardCategoryItemLabelGenerator g1
                = new StandardCategoryItemLabelGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    