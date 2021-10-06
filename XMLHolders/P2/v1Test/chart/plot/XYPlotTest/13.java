@Test
    public void testBug2817504() throws CloneNotSupportedException {
        XYPlot p1 = new XYPlot();
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        p1.setRenderer(r1);
        XYPlot p2 = (XYPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // check for independence
        XYLineAndShapeRenderer r2 = (XYLineAndShapeRenderer) p2.getRenderer();
        assertTrue(r2.getPlot() == p2);
    }

    