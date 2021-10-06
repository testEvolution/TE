@Test
    public void testEquals() {
        LegendGraphic g1 = new LegendGraphic(new Rectangle2D.Double(1.0, 2.0,
                3.0, 4.0), Color.BLACK);
        LegendGraphic g2 = new LegendGraphic(new Rectangle2D.Double(1.0, 2.0,
                3.0, 4.0), Color.BLACK);
        assertEquals(g1, g2);
        assertEquals(g2, g1);

        // shapeVisible
        g1.setShapeVisible(!g1.isShapeVisible());
        assertFalse(g1.equals(g2));
        g2.setShapeVisible(!g2.isShapeVisible());
        assertTrue(g1.equals(g2));

        // shape
        g1.setShape(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0));
        assertFalse(g1.equals(g2));
        g2.setShape(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0));
        assertTrue(g1.equals(g2));

        // shapeFilled
        g1.setShapeFilled(!g1.isShapeFilled());
        assertFalse(g1.equals(g2));
        g2.setShapeFilled(!g2.isShapeFilled());
        assertTrue(g1.equals(g2));

        // fillPaint
        g1.setFillPaint(Color.GREEN);
        assertFalse(g1.equals(g2));
        g2.setFillPaint(Color.GREEN);
        assertTrue(g1.equals(g2));

        // shapeOutlineVisible
        g1.setShapeOutlineVisible(!g1.isShapeOutlineVisible());
        assertFalse(g1.equals(g2));
        g2.setShapeOutlineVisible(!g2.isShapeOutlineVisible());
        assertTrue(g1.equals(g2));

        // outlinePaint
        g1.setOutlinePaint(Color.GREEN);
        assertFalse(g1.equals(g2));
        g2.setOutlinePaint(Color.GREEN);
        assertTrue(g1.equals(g2));

        // outlineStroke
        g1.setOutlineStroke(new BasicStroke(1.23f));
        assertFalse(g1.equals(g2));
        g2.setOutlineStroke(new BasicStroke(1.23f));
        assertTrue(g1.equals(g2));

        // shapeAnchor
        g1.setShapeAnchor(RectangleAnchor.BOTTOM_RIGHT);
        assertFalse(g1.equals(g2));
        g2.setShapeAnchor(RectangleAnchor.BOTTOM_RIGHT);
        assertTrue(g1.equals(g2));

        // shapeLocation
        g1.setShapeLocation(RectangleAnchor.BOTTOM_RIGHT);
        assertFalse(g1.equals(g2));
        g2.setShapeLocation(RectangleAnchor.BOTTOM_RIGHT);
        assertTrue(g1.equals(g2));

        // lineVisible
        g1.setLineVisible(!g1.isLineVisible());
        assertFalse(g1.equals(g2));
        g2.setLineVisible(!g2.isLineVisible());
        assertTrue(g1.equals(g2));

        // line
        g1.setLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0));
        assertFalse(g1.equals(g2));
        g2.setLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0));
        assertTrue(g1.equals(g2));

        // linePaint
        g1.setLinePaint(Color.GREEN);
        assertFalse(g1.equals(g2));
        g2.setLinePaint(Color.GREEN);
        assertTrue(g1.equals(g2));

        // lineStroke
        g1.setLineStroke(new BasicStroke(1.23f));
        assertFalse(g1.equals(g2));
        g2.setLineStroke(new BasicStroke(1.23f));
        assertTrue(g1.equals(g2));

        // fillPaintTransformer
        g1.setFillPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_HORIZONTAL));
        assertFalse(g1.equals(g2));
        g2.setFillPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_HORIZONTAL));
        assertTrue(g1.equals(g2));

    }

    