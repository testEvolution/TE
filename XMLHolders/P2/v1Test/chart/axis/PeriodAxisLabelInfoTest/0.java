@Test
    public void testEquals() {
        PeriodAxisLabelInfo info1 = new PeriodAxisLabelInfo(Day.class,
                new SimpleDateFormat("d"));
        PeriodAxisLabelInfo info2 = new PeriodAxisLabelInfo(Day.class,
                new SimpleDateFormat("d"));
        assertTrue(info1.equals(info2));
        assertTrue(info2.equals(info1));

        Class c1 = Day.class;
        Class c2 = Month.class;
        DateFormat df1 = new SimpleDateFormat("d");
        DateFormat df2 = new SimpleDateFormat("MMM");
        RectangleInsets sp1 = new RectangleInsets(1, 1, 1, 1);
        RectangleInsets sp2 = new RectangleInsets(2, 2, 2, 2);
        Font lf1 = new Font("SansSerif", Font.PLAIN, 10);
        Font lf2 = new Font("SansSerif", Font.BOLD, 9);
        Paint lp1 = Color.BLACK;
        Paint lp2 = Color.BLUE;
        boolean b1 = true;
        boolean b2 = false;
        Stroke s1 = new BasicStroke(0.5f);
        Stroke s2 = new BasicStroke(0.25f);
        Paint dp1 = Color.RED;
        Paint dp2 = Color.GREEN;

        info1 = new PeriodAxisLabelInfo(c2, df1, sp1, lf1, lp1, b1, s1, dp1);
        info2 = new PeriodAxisLabelInfo(c1, df1, sp1, lf1, lp1, b1, s1, dp1);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df1, sp1, lf1, lp1, b1, s1, dp1);
        assertTrue(info1.equals(info2));

        info1 = new PeriodAxisLabelInfo(c2, df2, sp1, lf1, lp1, b1, s1, dp1);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df2, sp1, lf1, lp1, b1, s1, dp1);
        assertTrue(info1.equals(info2));

        info1 = new PeriodAxisLabelInfo(c2, df2, sp2, lf1, lp1, b1, s1, dp1);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df2, sp2, lf1, lp1, b1, s1, dp1);
        assertTrue(info1.equals(info2));

        info1 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp1, b1, s1, dp1);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp1, b1, s1, dp1);
        assertTrue(info1.equals(info2));

        info1 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b1, s1, dp1);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b1, s1, dp1);
        assertTrue(info1.equals(info2));

        info1 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b2, s1, dp1);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b2, s1, dp1);
        assertTrue(info1.equals(info2));

        info1 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b2, s2, dp1);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b2, s2, dp1);
        assertTrue(info1.equals(info2));

        info1 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b2, s2, dp2);
        assertFalse(info1.equals(info2));
        info2 = new PeriodAxisLabelInfo(c2, df2, sp2, lf2, lp2, b2, s2, dp2);
        assertTrue(info1.equals(info2));

    }

    