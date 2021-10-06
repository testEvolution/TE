@Test
    public void testCloning_QuadrantPaint() throws CloneNotSupportedException {
        XYPlot p1 = new XYPlot();
        p1.setQuadrantPaint(3, new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        XYPlot p2 = (XYPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // check for independence
        p1.setQuadrantPaint(1, Color.RED);
        assertFalse(p1.equals(p2));
        p2.setQuadrantPaint(1, Color.RED);
        assertTrue(p1.equals(p2));
    }

    