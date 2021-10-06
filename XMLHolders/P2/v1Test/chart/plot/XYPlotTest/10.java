@Test
    public void testCloning4() throws CloneNotSupportedException {
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        XYPlot p1 = new XYPlot(null, new NumberAxis("Domain Axis"),
                new NumberAxis("Range Axis"), r1);
        XYPlot p2 = (XYPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // verify that the plot is listening to the cloned renderer
        XYLineAndShapeRenderer r2 = (XYLineAndShapeRenderer) p2.getRenderer();
        assertTrue(r2.hasListener(p2));
    }

    