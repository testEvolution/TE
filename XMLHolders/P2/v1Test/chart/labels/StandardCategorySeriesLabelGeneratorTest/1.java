@Test
    public void testEquals() {
        StandardCategorySeriesLabelGenerator g1
                = new StandardCategorySeriesLabelGenerator();
        StandardCategorySeriesLabelGenerator g2
                = new StandardCategorySeriesLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new StandardCategorySeriesLabelGenerator("{1}");
        assertFalse(g1.equals(g2));
        g2 = new StandardCategorySeriesLabelGenerator("{1}");
        assertTrue(g1.equals(g2));
    }

    