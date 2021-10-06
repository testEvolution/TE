@Test
    public void testSerialization() {
        IntervalCategoryToolTipGenerator g1
                = new IntervalCategoryToolTipGenerator("{3} - {4}",
                DateFormat.getInstance());
        IntervalCategoryToolTipGenerator g2 = (IntervalCategoryToolTipGenerator)
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}