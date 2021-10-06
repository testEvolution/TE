@Test
    public void testCloning2() throws CloneNotSupportedException {
        BarRenderer r1 = new BarRenderer();
        r1.setDefaultItemLabelGenerator(new IntervalCategoryItemLabelGenerator());
        BarRenderer r2 = (BarRenderer) r1.clone();

        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        r1 = new BarRenderer();
        r1.setSeriesItemLabelGenerator(0,
                new IntervalCategoryItemLabelGenerator());
        r2 = (BarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        r1 = new BarRenderer();
        r1.setDefaultItemLabelGenerator(new IntervalCategoryItemLabelGenerator());
        r2 = (BarRenderer) r1.clone();

        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    