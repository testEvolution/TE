@Test
    public void testEquals() {
        BarRenderer r1 = new BarRenderer();
        BarRenderer r2 = new BarRenderer();
        assertEquals(r1, r2);

        // the plot field is NOT tested

        // toolTipGeneratorList
        r1.setSeriesToolTipGenerator(1, new StandardCategoryToolTipGenerator());
        assertFalse(r1.equals(r2));
        r2.setSeriesToolTipGenerator(1, new StandardCategoryToolTipGenerator());
        assertTrue(r1.equals(r2));

        // defaultToolTipGenerator
        r1.setDefaultToolTipGenerator(new StandardCategoryToolTipGenerator("{2}",
                NumberFormat.getInstance()));
        assertFalse(r1.equals(r2));
        r2.setDefaultToolTipGenerator(new StandardCategoryToolTipGenerator("{2}",
                NumberFormat.getInstance()));
        assertTrue(r1.equals(r2));

        // itemLabelGeneratorList
        r1.setSeriesItemLabelGenerator(1,
                new StandardCategoryItemLabelGenerator());
        assertFalse(r1.equals(r2));
        r2.setSeriesItemLabelGenerator(1,
                new StandardCategoryItemLabelGenerator());
        assertTrue(r1.equals(r2));

        // defaultItemLabelGenerator
        r1.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator(
                "{2}", NumberFormat.getInstance()));
        assertFalse(r1.equals(r2));
        r2.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator(
                "{2}", NumberFormat.getInstance()));
        assertTrue(r1.equals(r2));

        // urlGeneratorList
        r1.setSeriesItemURLGenerator(1, new StandardCategoryURLGenerator());
        assertFalse(r1.equals(r2));
        r2.setSeriesItemURLGenerator(1, new StandardCategoryURLGenerator());
        assertTrue(r1.equals(r2));

        // defaultItemURLGenerator
        r1.setDefaultItemURLGenerator(new StandardCategoryURLGenerator(
                "abc.html"));
        assertFalse(r1.equals(r2));
        r2.setDefaultItemURLGenerator(new StandardCategoryURLGenerator(
                "abc.html"));
        assertTrue(r1.equals(r2));

        // legendItemLabelGenerator
        r1.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator(
                "XYZ"));
        assertFalse(r1.equals(r2));
        r2.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator(
                "XYZ"));
        assertTrue(r1.equals(r2));

        // legendItemToolTipGenerator
        r1.setLegendItemToolTipGenerator(
                new StandardCategorySeriesLabelGenerator("ToolTip"));
        assertFalse(r1.equals(r2));
        r2.setLegendItemToolTipGenerator(
                new StandardCategorySeriesLabelGenerator("ToolTip"));
        assertTrue(r1.equals(r2));

        // legendItemURLGenerator
        r1.setLegendItemURLGenerator(
                new StandardCategorySeriesLabelGenerator("URL"));
        assertFalse(r1.equals(r2));
        r2.setLegendItemURLGenerator(
                new StandardCategorySeriesLabelGenerator("URL"));
        assertTrue(r1.equals(r2));
    }

    