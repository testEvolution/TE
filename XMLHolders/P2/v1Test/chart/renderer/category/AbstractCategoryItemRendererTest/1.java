@Test
    public void testEquals_ObjectList() {
        BarRenderer r1 = new BarRenderer();
        r1.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        BarRenderer r2 = new BarRenderer();
        r2.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        assertEquals(r1, r2);
        r2.setSeriesItemLabelGenerator(1, new StandardCategoryItemLabelGenerator("X", new DecimalFormat("0.0")));
        assertNotEquals(r1, r2);
    }

    