@Test
    public void testEquals() {
        StandardPieToolTipGenerator g1 = new StandardPieToolTipGenerator();
        StandardPieToolTipGenerator g2 = new StandardPieToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new StandardPieToolTipGenerator("{0}",
                new DecimalFormat("#,##0.00"),
                NumberFormat.getPercentInstance());
        assertFalse(g1.equals(g2));
        g2 = new StandardPieToolTipGenerator("{0}",
                new DecimalFormat("#,##0.00"),
                NumberFormat.getPercentInstance());
        assertTrue(g1.equals(g2));

        g1 = new StandardPieToolTipGenerator("{0} {1}",
                new DecimalFormat("#,##0.00"),
                NumberFormat.getPercentInstance());
        assertFalse(g1.equals(g2));
        g2 = new StandardPieToolTipGenerator("{0} {1}",
                new DecimalFormat("#,##0.00"),
                NumberFormat.getPercentInstance());
        assertTrue(g1.equals(g2));

        g1 = new StandardPieToolTipGenerator("{0} {1}",
                new DecimalFormat("#,##0"), NumberFormat.getPercentInstance());
        assertFalse(g1.equals(g2));
        g2 = new StandardPieToolTipGenerator("{0} {1}",
                new DecimalFormat("#,##0"), NumberFormat.getPercentInstance());
        assertTrue(g1.equals(g2));

        g1 = new StandardPieToolTipGenerator("{0} {1}",
                new DecimalFormat("#,##0"), new DecimalFormat("0.000%"));
        assertFalse(g1.equals(g2));
        g2 = new StandardPieToolTipGenerator("{0} {1}",
                new DecimalFormat("#,##0"), new DecimalFormat("0.000%"));
        assertTrue(g1.equals(g2));
    }

    