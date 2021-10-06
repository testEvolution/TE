@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardXYSeriesLabelGenerator g1
                = new StandardXYSeriesLabelGenerator("Series {0}");
        StandardXYSeriesLabelGenerator g2 = (StandardXYSeriesLabelGenerator) 
                g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    