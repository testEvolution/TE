@Test
    public void testHashCode() {
        StandardCategorySeriesLabelGenerator g1
                = new StandardCategorySeriesLabelGenerator();
        StandardCategorySeriesLabelGenerator g2
                = new StandardCategorySeriesLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    