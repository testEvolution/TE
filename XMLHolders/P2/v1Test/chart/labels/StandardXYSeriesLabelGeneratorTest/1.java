@Test
    public void testEquals() {
        StandardXYSeriesLabelGenerator g1
                = new StandardXYSeriesLabelGenerator("Series {0}");
        StandardXYSeriesLabelGenerator g2
                = new StandardXYSeriesLabelGenerator("Series {0}");
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new StandardXYSeriesLabelGenerator("{1}");
        assertFalse(g1.equals(g2));
        g2 = new StandardXYSeriesLabelGenerator("{1}");
        assertTrue(g1.equals(g2));
    }

    