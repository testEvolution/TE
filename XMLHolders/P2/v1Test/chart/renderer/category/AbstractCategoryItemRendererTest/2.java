@Test
    public void testEquals_ObjectList2() {
        BarRenderer r1 = new BarRenderer();
        r1.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        BarRenderer r2 = new BarRenderer();
        r2.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        assertEquals(r1, r2);
        r2.setSeriesToolTipGenerator(1, new StandardCategoryToolTipGenerator("X", new DecimalFormat("0.0")));
        assertNotEquals(r1, r2);
    }

    