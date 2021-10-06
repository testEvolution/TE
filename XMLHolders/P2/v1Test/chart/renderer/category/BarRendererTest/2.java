@Test
    public void testCloning() throws CloneNotSupportedException {
        BarRenderer r1 = new BarRenderer();
        r1.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        r1.setBarPainter(new GradientBarPainter(0.11, 0.22, 0.33));
        BarRenderer r2 = (BarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    