@Test
    public void testHashCode() {
        MultipleXYSeriesLabelGenerator g1
                = new MultipleXYSeriesLabelGenerator();
        MultipleXYSeriesLabelGenerator g2
                = new MultipleXYSeriesLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    