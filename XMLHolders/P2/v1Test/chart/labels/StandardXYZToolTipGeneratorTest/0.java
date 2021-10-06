@Test
    public void testEquals() {

        // some setup...
        String f1 = "{1}";
        String f2 = "{2}";
        NumberFormat xnf1 = new DecimalFormat("0.00");
        NumberFormat xnf2 = new DecimalFormat("0.000");
        NumberFormat ynf1 = new DecimalFormat("0.00");
        NumberFormat ynf2 = new DecimalFormat("0.000");
        NumberFormat znf1 = new DecimalFormat("0.00");
        NumberFormat znf2 = new DecimalFormat("0.000");

        DateFormat xdf1 = new SimpleDateFormat("d-MMM");
        DateFormat xdf2 = new SimpleDateFormat("d-MMM-yyyy");
        DateFormat ydf1 = new SimpleDateFormat("d-MMM");
        DateFormat ydf2 = new SimpleDateFormat("d-MMM-yyyy");
        DateFormat zdf1 = new SimpleDateFormat("d-MMM");
        DateFormat zdf2 = new SimpleDateFormat("d-MMM-yyyy");

        StandardXYZToolTipGenerator g1 = null;
        StandardXYZToolTipGenerator g2 = null;

        g1 = new StandardXYZToolTipGenerator(f1, xnf1, ynf1, znf1);
        g2 = new StandardXYZToolTipGenerator(f1, xnf1, ynf1, znf1);
        assertTrue(g1.equals(g2));

        // format string...
        g1 = new StandardXYZToolTipGenerator(f2, xnf1, ynf1, znf1);
        assertFalse(g1.equals(g2));
        g2 = new StandardXYZToolTipGenerator(f2, xnf1, ynf1, znf1);
        assertTrue(g1.equals(g2));

        // x number format
        g1 = new StandardXYZToolTipGenerator(f2, xnf2, ynf1, znf1);
        assertFalse(g1.equals(g2));
        g2 = new StandardXYZToolTipGenerator(f2, xnf2, ynf1, znf1);
        assertTrue(g1.equals(g2));

        // y number format
        g1 = new StandardXYZToolTipGenerator(f2, xnf2, ynf2, znf1);
        assertFalse(g1.equals(g2));
        g2 = new StandardXYZToolTipGenerator(f2, xnf2, ynf2, znf1);
        assertTrue(g1.equals(g2));

        // z number format
        g1 = new StandardXYZToolTipGenerator(f2, xnf2, ynf2, znf2);
        assertFalse(g1.equals(g2));
        g2 = new StandardXYZToolTipGenerator(f2, xnf2, ynf2, znf2);
        assertTrue(g1.equals(g2));

        g1 = new StandardXYZToolTipGenerator(f2, xdf1, ydf1, zdf1);
        g2 = new StandardXYZToolTipGenerator(f2, xdf1, ydf1, zdf1);
        assertTrue(g1.equals(g2));

        // x date format
        g1 = new StandardXYZToolTipGenerator(f2, xdf2, ydf1, zdf1);
        assertFalse(g1.equals(g2));
        g2 = new StandardXYZToolTipGenerator(f2, xdf2, ydf1, zdf1);
        assertTrue(g1.equals(g2));

        // y date format
        g1 = new StandardXYZToolTipGenerator(f2, xdf2, ydf2, zdf1);
        assertFalse(g1.equals(g2));
        g2 = new StandardXYZToolTipGenerator(f2, xdf2, ydf2, zdf1);
        assertTrue(g1.equals(g2));

        // z date format
        g1 = new StandardXYZToolTipGenerator(f2, xdf2, ydf2, zdf2);
        assertFalse(g1.equals(g2));
        g2 = new StandardXYZToolTipGenerator(f2, xdf2, ydf2, zdf2);
        assertTrue(g1.equals(g2));

    }

    