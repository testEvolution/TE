@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardCategoryItemLabelGenerator g1
                = new StandardCategoryItemLabelGenerator();
        StandardCategoryItemLabelGenerator g2 
                = (StandardCategoryItemLabelGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    