@Test
    public void testEquals() {

        // standard test
        BoxAndWhiskerXYToolTipGenerator g1
                = new BoxAndWhiskerXYToolTipGenerator();
        BoxAndWhiskerXYToolTipGenerator g2
                = new BoxAndWhiskerXYToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        // tooltip format
        g1 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.0"));
        g2 = new BoxAndWhiskerXYToolTipGenerator("{1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.0"));
        assertFalse(g1.equals(g2));
        g2 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.0"));
        assertTrue(g1.equals(g2));

        // date format
        g1 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.0"));
        g2 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("MMM-yyyy"), new DecimalFormat("0.0"));
        assertFalse(g1.equals(g2));
        g2 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.0"));
        assertTrue(g1.equals(g2));

        // Y format
        g1 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.0"));
        g2 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.00"));
        assertFalse(g1.equals(g2));
        g2 = new BoxAndWhiskerXYToolTipGenerator("{0} --> {1} {2}",
                new SimpleDateFormat("yyyy"), new DecimalFormat("0.0"));
        assertTrue(g1.equals(g2));
    }

    