@Test
    public void testHashCode() {
        StandardXYSeriesLabelGenerator g1
                = new StandardXYSeriesLabelGenerator();
        StandardXYSeriesLabelGenerator g2
                = new StandardXYSeriesLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    