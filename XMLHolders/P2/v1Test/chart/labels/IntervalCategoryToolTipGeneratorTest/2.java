@Test
    public void testHashCode() {
        IntervalCategoryToolTipGenerator g1
                = new IntervalCategoryToolTipGenerator();
        IntervalCategoryToolTipGenerator g2
                = new IntervalCategoryToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    