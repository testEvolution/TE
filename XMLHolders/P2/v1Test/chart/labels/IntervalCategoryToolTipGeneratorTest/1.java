@Test
    public void testEquals2() {
        IntervalCategoryToolTipGenerator g1
                = new IntervalCategoryToolTipGenerator();
        StandardCategoryToolTipGenerator g2
                = new StandardCategoryToolTipGenerator(
                IntervalCategoryToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT_STRING,
                NumberFormat.getInstance());
        assertFalse(g1.equals(g2));
    }

    