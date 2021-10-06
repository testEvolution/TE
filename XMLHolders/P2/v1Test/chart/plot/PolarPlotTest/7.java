@Test
    public void testTranslateToJava2D_LogAxis() {
        
        Rectangle2D dataArea = new Rectangle2D.Double(0.0, 0.0, 100.0, 100.0);
        ValueAxis axis = new LogAxis();
        axis.setRange(1.0, 100.0);

        PolarPlot plot = new PolarPlot(null, axis, null);
        plot.setMargin(0);
        plot.setAngleOffset(0.0);

        Point point = plot.translateToJava2D(0.0, 10.0, axis, dataArea );
        assertEquals(75.0, point.getX(), 0.5);
        assertEquals(50.0, point.getY(), 0.5);

        point = plot.translateToJava2D(90.0, 5.0, axis, dataArea );
        assertEquals(50.0, point.getX(), 0.5);
        assertEquals(67.5, point.getY(), 0.5);

        point = plot.translateToJava2D(45.0, 20.0, axis, dataArea );
        assertEquals(73.0, point.getX(), 0.5);
        assertEquals(73.0, point.getY(), 0.5);
    }
}