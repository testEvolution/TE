@Test
    public void testCloning1() throws CloneNotSupportedException {
        AbstractCategoryItemRenderer r1 = new BarRenderer();
        AbstractCategoryItemRenderer r2 = (BarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        r1 = new BarRenderer();
        r1.setSeriesItemLabelGenerator(0,
                new StandardCategoryItemLabelGenerator());
        r2 = (BarRenderer) r1.clone();

        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        r1 = new BarRenderer();
        r1.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        r2 = (BarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    