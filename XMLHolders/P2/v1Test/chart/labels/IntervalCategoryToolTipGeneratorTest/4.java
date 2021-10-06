@Test
    public void testPublicCloneable() {
        IntervalCategoryToolTipGenerator g1
                = new IntervalCategoryToolTipGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    