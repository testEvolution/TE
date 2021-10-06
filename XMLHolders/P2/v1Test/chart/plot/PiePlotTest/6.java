@Test
    public void testCloning_LegendLabelURLGenerator() throws CloneNotSupportedException {
        CustomPieURLGenerator generator = new CustomPieURLGenerator();
        PiePlot p1 = new PiePlot();
        p1.setLegendLabelURLGenerator(generator);
        PiePlot p2 = (PiePlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // check that the URL generator has been cloned
        assertTrue(p1.getLegendLabelURLGenerator()
                != p2.getLegendLabelURLGenerator());
    }

    