@Test
    public void testCloning() throws CloneNotSupportedException {
        PlotRenderingInfo p1 = new PlotRenderingInfo(new ChartRenderingInfo());
        p1.setPlotArea(new Rectangle2D.Double());
        PlotRenderingInfo p2 = (PlotRenderingInfo) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // check independence
        p1.getPlotArea().setRect(1.0, 2.0, 3.0, 4.0);
        assertFalse(p1.equals(p2));
        p2.getPlotArea().setRect(1.0, 2.0, 3.0, 4.0);
        assertTrue(p1.equals(p2));

        p1.getDataArea().setRect(4.0, 3.0, 2.0, 1.0);
        assertFalse(p1.equals(p2));
        p2.getDataArea().setRect(4.0, 3.0, 2.0, 1.0);
        assertTrue(p1.equals(p2));
    }

    