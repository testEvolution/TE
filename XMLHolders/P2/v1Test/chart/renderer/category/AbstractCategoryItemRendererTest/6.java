@Test
    public void testCloning_LegendItemLabelGenerator() 
            throws CloneNotSupportedException {
        StandardCategorySeriesLabelGenerator generator
                = new StandardCategorySeriesLabelGenerator("Series {0}");
        BarRenderer r1 = new BarRenderer();
        r1.setLegendItemLabelGenerator(generator);
        BarRenderer r2 = (BarRenderer) r1.clone();

        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        // check that the generator has been cloned
        assertTrue(r1.getLegendItemLabelGenerator()
                != r2.getLegendItemLabelGenerator());
    }

    