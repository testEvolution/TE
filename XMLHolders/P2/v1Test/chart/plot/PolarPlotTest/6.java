@Test
    public void testTranslateToJava2D_NumberAxisAndMargin() {
        
        Rectangle2D dataArea = new Rectangle2D.Double(10.0, 10.0, 80.0, 80.0);
        ValueAxis axis = new NumberAxis();
        axis.setRange(-2.0, 2.0);

        PolarPlot plot = new PolarPlot(null, axis, null);
        plot.setAngleOffset(0.0);

        Point point = plot.translateToJava2D(0.0, 10.0, axis, dataArea );
        assertEquals(110.0, point.getX(), 0.5);
        assertEquals(50.0, point.getY(), 0.5);

        point = plot.translateToJava2D(90.0, 5.0, axis, dataArea );
        assertEquals(50.0, point.getX(), 0.5);
        assertEquals(85.0, point.getY(), 0.5);

        point = plot.translateToJava2D(45.0, 20.0, axis, dataArea );
        assertEquals(128.0, point.getX(), 0.5);
        assertEquals(128.0, point.getY(), 0.5);

        point = plot.translateToJava2D(135.0, 20.0, axis, dataArea );
        assertEquals(-28.0, point.getX(), 0.5);
        assertEquals(128.0, point.getY(), 0.5);

        point = plot.translateToJava2D(225.0, 15.0, axis, dataArea );
        assertEquals(-10.0, point.getX(), 0.5);
        assertEquals(-10.0, point.getY(), 0.5);

        point = plot.translateToJava2D(315.0, 15.0, axis, dataArea );
        assertEquals(110.0, point.getX(), 0.5);
        assertEquals(-10.0, point.getY(), 0.5);
        
        point = plot.translateToJava2D(21.0, 11.5, axis, dataArea );
        assertEquals(113.0, point.getX(), 0.5);
        assertEquals(74.0, point.getY(), 0.5);
        
        point = plot.translateToJava2D(162.0, 7.0, axis, dataArea );
        assertEquals(7.0, point.getX(), 0.5);
        assertEquals(64.0, point.getY(), 0.5);
        
    }

    