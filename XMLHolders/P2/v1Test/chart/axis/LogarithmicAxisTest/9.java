private void checkPointsToJava2D(RectangleEdge edge, Rectangle2D plotArea) {
        assertEquals(plotArea.getX(), this.axis.valueToJava2D(
                this.axis.getLowerBound(), plotArea, edge), EPSILON, 
                "Left most point on the axis should be beginning of range.");
        assertEquals(plotArea.getX() + plotArea.getWidth(),
                this.axis.valueToJava2D(this.axis.getUpperBound(),
                plotArea, edge), EPSILON, 
                "Right most point on the axis should be end of range.");
        assertEquals(plotArea.getX() + (plotArea.getWidth() / 2),
                this.axis.valueToJava2D(Math.sqrt(this.axis.getLowerBound()
                * this.axis.getUpperBound()), plotArea, edge), EPSILON, 
                "Center point on the axis should geometric mean of the bounds.");
    }

    