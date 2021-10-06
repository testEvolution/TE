@Test
    public void testValueToJava2D() {
        Rectangle2D plotArea = new Rectangle2D.Double(22, 33, 500, 500);
        RectangleEdge edge = RectangleEdge.BOTTOM;

        // set axis bounds to be both greater than 1
        this.axis.setRange(10, 20);
        checkPointsToJava2D(edge, plotArea);

        // check for bounds interval that includes 1
        this.axis.setRange(0.5, 10);
        checkPointsToJava2D(edge, plotArea);

        // check for bounds interval that includes 1
        this.axis.setRange(0.2, 20);
        checkPointsToJava2D(edge, plotArea);

        // check for both bounds smaller than 1
        this.axis.setRange(0.2, 0.7);
        checkPointsToJava2D(edge, plotArea);
    }

    