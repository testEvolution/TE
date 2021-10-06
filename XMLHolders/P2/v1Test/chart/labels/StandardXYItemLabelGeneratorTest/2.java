@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardXYItemLabelGenerator g1 = new StandardXYItemLabelGenerator();
        StandardXYItemLabelGenerator g2 = (StandardXYItemLabelGenerator) 
                g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        g1.getXFormat().setMinimumIntegerDigits(2);
        assertFalse(g1.equals(g2));
        g2.getXFormat().setMinimumIntegerDigits(2);
        assertTrue(g1.equals(g2));

        g1.getYFormat().setMinimumIntegerDigits(2);
        assertFalse(g1.equals(g2));
        g2.getYFormat().setMinimumIntegerDigits(2);
        assertTrue(g1.equals(g2));

        // another test...
        g1 = new StandardXYItemLabelGenerator("{0} {1} {2}",
                DateFormat.getInstance(), DateFormat.getInstance());
        g2 = (StandardXYItemLabelGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        g1.getXDateFormat().setNumberFormat(new DecimalFormat("0.000"));
        assertFalse(g1.equals(g2));
        g2.getXDateFormat().setNumberFormat(new DecimalFormat("0.000"));
        assertTrue(g1.equals(g2));

        g1.getYDateFormat().setNumberFormat(new DecimalFormat("0.000"));
        assertFalse(g1.equals(g2));
        g2.getYDateFormat().setNumberFormat(new DecimalFormat("0.000"));
        assertTrue(g1.equals(g2));

    }

    