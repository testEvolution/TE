@Test
    public void testHashCode() {
        IntervalCategoryItemLabelGenerator g1
                = new IntervalCategoryItemLabelGenerator();
        IntervalCategoryItemLabelGenerator g2
                = new IntervalCategoryItemLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    