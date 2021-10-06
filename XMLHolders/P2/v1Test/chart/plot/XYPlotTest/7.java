@Test
    public void testCloning() throws CloneNotSupportedException {
        XYPlot p1 = new XYPlot();
        XYPlot p2 = (XYPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));
    }

    