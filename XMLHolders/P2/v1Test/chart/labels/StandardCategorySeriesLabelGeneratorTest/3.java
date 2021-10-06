@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardCategorySeriesLabelGenerator g1
                = new StandardCategorySeriesLabelGenerator("{1}");
        StandardCategorySeriesLabelGenerator g2 
                = (StandardCategorySeriesLabelGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    