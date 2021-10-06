@Test
    public void testCloning() throws CloneNotSupportedException {
        IntervalCategoryItemLabelGenerator g1
                = new IntervalCategoryItemLabelGenerator();
        IntervalCategoryItemLabelGenerator g2 
                = (IntervalCategoryItemLabelGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    