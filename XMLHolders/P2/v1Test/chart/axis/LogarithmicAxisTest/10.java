private void checkPointsToValue(RectangleEdge edge, Rectangle2D plotArea) {
         assertEquals(this.axis.getUpperBound(), this.axis.java2DToValue(
                 plotArea.getX() + plotArea.getWidth(), plotArea, edge),
                 EPSILON, "Right most point on the axis should be end of range.");

         assertEquals(this.axis.getLowerBound(),
                 this.axis.java2DToValue(plotArea.getX(), plotArea, edge),
                 EPSILON, "Left most point on the axis should be beginning of range.");

         assertEquals(Math.sqrt(this.axis.getUpperBound()
                 * this.axis.getLowerBound()), this.axis.java2DToValue(
                 plotArea.getX() + (plotArea.getWidth() / 2), plotArea, edge),
                 EPSILON, "Center point on the axis should geometric mean of the bounds.");
    }

}