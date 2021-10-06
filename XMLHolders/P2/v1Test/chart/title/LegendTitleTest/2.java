@Test
    public void testCloning() throws CloneNotSupportedException {
        XYPlot plot = new XYPlot();
        Rectangle2D bounds1 = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);
        LegendTitle t1 = new LegendTitle(plot);
        t1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW));
        t1.setBounds(bounds1);
        LegendTitle t2 = (LegendTitle) t1.clone();
        assertTrue(t1 != t2);
        assertTrue(t1.getClass() == t2.getClass());
        assertTrue(t1.equals(t2));

        // check independence
        bounds1.setFrame(40.0, 30.0, 20.0, 10.0);
        assertFalse(t1.equals(t2));
        t2.setBounds(new Rectangle2D.Double(40.0, 30.0, 20.0, 10.0));
        assertTrue(t1.equals(t2));
    }

    