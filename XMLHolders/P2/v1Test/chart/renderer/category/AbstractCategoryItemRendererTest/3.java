@Test
    public void testEquals_ObjectList3() {
        BarRenderer r1 = new BarRenderer();
        r1.setSeriesItemURLGenerator(0, new StandardCategoryURLGenerator());
        BarRenderer r2 = new BarRenderer();
        r2.setSeriesItemURLGenerator(0, new StandardCategoryURLGenerator());
        assertEquals(r1, r2);
        r2.setSeriesItemURLGenerator(1, new StandardCategoryURLGenerator());
        assertNotEquals(r1, r2);
    }

    