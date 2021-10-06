@Test
    public void testEquals_ObjectList5() {
        XYPlot p1 = new XYPlot();
        p1.setRenderer(new XYBarRenderer());
        XYPlot p2 = new XYPlot();
        p2.setRenderer(new XYBarRenderer());
        assertEquals(p1, p2);
        p2.setRenderer(1, new XYLineAndShapeRenderer());
        assertNotEquals(p1, p2);
    }

    