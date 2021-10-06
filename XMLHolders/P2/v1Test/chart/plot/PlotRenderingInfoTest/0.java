@Test
    public void testEquals() {
        PlotRenderingInfo p1 = new PlotRenderingInfo(new ChartRenderingInfo());
        PlotRenderingInfo p2 = new PlotRenderingInfo(new ChartRenderingInfo());
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));

        p1.setPlotArea(new Rectangle(2, 3, 4, 5));
        assertFalse(p1.equals(p2));
        p2.setPlotArea(new Rectangle(2, 3, 4, 5));
        assertTrue(p1.equals(p2));

        p1.setDataArea(new Rectangle(2, 4, 6, 8));
        assertFalse(p1.equals(p2));
        p2.setDataArea(new Rectangle(2, 4, 6, 8));
        assertTrue(p1.equals(p2));

        p1.addSubplotInfo(new PlotRenderingInfo(null));
        assertFalse(p1.equals(p2));
        p2.addSubplotInfo(new PlotRenderingInfo(null));
        assertTrue(p1.equals(p2));

        p1.getSubplotInfo(0).setDataArea(new Rectangle(1, 2, 3, 4));
        assertFalse(p1.equals(p2));
        p2.getSubplotInfo(0).setDataArea(new Rectangle(1, 2, 3, 4));
        assertTrue(p1.equals(p2));
    }

    