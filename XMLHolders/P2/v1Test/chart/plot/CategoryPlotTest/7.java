@Test
    public void testEquals_ObjectList5() {
        CategoryPlot p1 = new CategoryPlot();
        p1.setRenderer(new BarRenderer());
        CategoryPlot p2 = new CategoryPlot();
        p2.setRenderer(new BarRenderer());
        assertEquals(p1, p2);
        p2.setRenderer(1, new LineAndShapeRenderer());
        assertNotEquals(p1, p2);
    }

    