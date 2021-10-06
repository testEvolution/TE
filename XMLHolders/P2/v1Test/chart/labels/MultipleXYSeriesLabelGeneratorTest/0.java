@Test
    public void testEquals() {
        MultipleXYSeriesLabelGenerator g1
                = new MultipleXYSeriesLabelGenerator();
        MultipleXYSeriesLabelGenerator g2
                = new MultipleXYSeriesLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new MultipleXYSeriesLabelGenerator("Series {0}");
        assertFalse(g1.equals(g2));
        g2 = new MultipleXYSeriesLabelGenerator("Series {0}");
        assertTrue(g1.equals(g2));

        g1.addSeriesLabel(1, "Additional 1");
        assertFalse(g1.equals(g2));
        g2.addSeriesLabel(1, "Additional 1");
        assertTrue(g1.equals(g2));
    }

    