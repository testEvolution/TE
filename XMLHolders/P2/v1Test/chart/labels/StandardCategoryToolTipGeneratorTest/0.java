@Test
    public void testEquals() {

        StandardCategoryToolTipGenerator g1
                = new StandardCategoryToolTipGenerator();
        StandardCategoryToolTipGenerator g2
                = new StandardCategoryToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new StandardCategoryToolTipGenerator("{0}",
                new DecimalFormat("0.000"));
        assertFalse(g1.equals(g2));
        g2 = new StandardCategoryToolTipGenerator("{0}",
                new DecimalFormat("0.000"));
        assertTrue(g1.equals(g2));

        g1 = new StandardCategoryToolTipGenerator("{1}",
                new DecimalFormat("0.000"));
        assertFalse(g1.equals(g2));
        g2 = new StandardCategoryToolTipGenerator("{1}",
                new DecimalFormat("0.000"));
        assertTrue(g1.equals(g2));

        g1 = new StandardCategoryToolTipGenerator("{2}",
                new SimpleDateFormat("d-MMM"));
        assertFalse(g1.equals(g2));
        g2 = new StandardCategoryToolTipGenerator("{2}",
                new SimpleDateFormat("d-MMM"));
        assertTrue(g1.equals(g2));

    }

    