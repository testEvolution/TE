@Test
     public void testJava2DToValue() {
         Rectangle2D plotArea = new Rectangle2D.Double(22, 33, 500, 500);
         RectangleEdge edge = RectangleEdge.BOTTOM;

         // set axis bounds to be both greater than 1
         this.axis.setRange(10, 20);
         checkPointsToValue(edge, plotArea);

         // check for bounds interval that includes 1
         this.axis.setRange(0.5, 10);
         checkPointsToValue(edge, plotArea);

         // check for bounds interval that includes 1
         this.axis.setRange(0.2, 20);
         checkPointsToValue(edge, plotArea);

         // check for both bounds smaller than 1
         this.axis.setRange(0.2, 0.7);
         checkPointsToValue(edge, plotArea);
     }

    