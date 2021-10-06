@Test
    public void testTranslateToJava2D_NumberAxis() {
        
        Rectangle2D dataArea = new Rectangle2D.Double(0.0, 0.0, 100.0, 100.0);
        ValueAxis axis = new NumberAxis();
        axis.setRange(0.0, 20.0);

        PolarPlot plot = new PolarPlot(null, axis, null);
        plot.setMargin(0);
        plot.setAngleOffset(0.0);

        Point point = plot.translateToJava2D(0.0, 10.0, axis, dataArea );
        assertEquals(75.0, point.getX(), 0.5);
        assertEquals(50.0, point.getY(), 0.5);

        point = plot.translateToJava2D(90.0, 5.0, axis, dataArea );
        assertEquals(50.0, point.getX(), 0.5);
        assertEquals(62.5, point.getY(), 0.5);

        point = plot.translateToJava2D(45.0, 20.0, axis, dataArea );
        assertEquals(85.0, point.getX(), 0.5);
        assertEquals(85.0, point.getY(), 0.5);

        point = plot.translateToJava2D(135.0, 20.0, axis, dataArea );
        assertEquals(15.0, point.getX(), 0.5);
        assertEquals(85.0, point.getY(), 0.5);

        point = plot.translateToJava2D(225.0, 15.0, axis, dataArea );
        assertEquals(23.0, point.getX(), 0.5);
        assertEquals(23.0, point.getY(), 0.5);

        point = plot.translateToJava2D(315.0, 15.0, axis, dataArea );
        assertEquals(77.0, point.getX(), 0.5);
        assertEquals(23.0, point.getY(), 0.5);
        
        point = plot.translateToJava2D(21.0, 11.5, axis, dataArea );
        assertEquals(77.0, point.getX(), 0.5);
        assertEquals(60.0, point.getY(), 0.5);
        
        point = plot.translateToJava2D(162.0, 7.0, axis, dataArea );
        assertEquals(33.0, point.getX(), 0.5);
        assertEquals(55.0, point.getY(), 0.5);
        
    }

    