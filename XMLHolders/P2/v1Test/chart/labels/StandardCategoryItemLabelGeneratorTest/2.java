@Test
    public void testHashCode() {
        StandardCategoryItemLabelGenerator g1
                = new StandardCategoryItemLabelGenerator();
        StandardCategoryItemLabelGenerator g2
                = new StandardCategoryItemLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    