@Test
    public void testEquals() {
        IntervalCategoryToolTipGenerator g1
                = new IntervalCategoryToolTipGenerator();
        IntervalCategoryToolTipGenerator g2
                = new IntervalCategoryToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new IntervalCategoryToolTipGenerator("{3} - {4}",
                new DecimalFormat("0.000"));
        assertFalse(g1.equals(g2));
        g2 = new IntervalCategoryToolTipGenerator("{3} - {4}",
                new DecimalFormat("0.000"));
        assertTrue(g1.equals(g2));

        g1 = new IntervalCategoryToolTipGenerator("{3} - {4}",
                new SimpleDateFormat("d-MMM"));
        assertFalse(g1.equals(g2));
        g2 = new IntervalCategoryToolTipGenerator("{3} - {4}",
                new SimpleDateFormat("d-MMM"));
        assertTrue(g1.equals(g2));
    }

    