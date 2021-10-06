@Test
    public void testCloning_LegendItemToolTipGenerator() 
            throws CloneNotSupportedException {
        StandardXYSeriesLabelGenerator generator
                = new StandardXYSeriesLabelGenerator("Series {0}");
        XYBarRenderer r1 = new XYBarRenderer();
        r1.setLegendItemToolTipGenerator(generator);
        XYBarRenderer r2 = (XYBarRenderer) r1.clone();

        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        // check that the generator has been cloned
        assertTrue(r1.getLegendItemToolTipGenerator()
                != r2.getLegendItemToolTipGenerator());
    }

    