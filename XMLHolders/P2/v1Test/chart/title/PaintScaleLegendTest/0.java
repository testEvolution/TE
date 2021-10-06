@Test
    public void testEquals() {

        // default instances
        PaintScaleLegend l1 = new PaintScaleLegend(new GrayPaintScale(),
                new NumberAxis("X"));
        PaintScaleLegend l2 = new PaintScaleLegend(new GrayPaintScale(),
                new NumberAxis("X"));
        assertTrue(l1.equals(l2));
        assertTrue(l2.equals(l1));

        // paintScale
        l1.setScale(new LookupPaintScale());
        assertFalse(l1.equals(l2));
        l2.setScale(new LookupPaintScale());
        assertTrue(l1.equals(l2));

        // axis
        l1.setAxis(new NumberAxis("Axis 2"));
        assertFalse(l1.equals(l2));
        l2.setAxis(new NumberAxis("Axis 2"));
        assertTrue(l1.equals(l2));

        // axisLocation
        l1.setAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertFalse(l1.equals(l2));
        l2.setAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertTrue(l1.equals(l2));

        // axisOffset
        l1.setAxisOffset(99.0);
        assertFalse(l1.equals(l2));
        l2.setAxisOffset(99.0);
        assertTrue(l1.equals(l2));

        // stripWidth
        l1.setStripWidth(99.0);
        assertFalse(l1.equals(l2));
        l2.setStripWidth(99.0);
        assertTrue(l1.equals(l2));

        // stripOutlineVisible
        l1.setStripOutlineVisible(!l1.isStripOutlineVisible());
        assertFalse(l1.equals(l2));
        l2.setStripOutlineVisible(l1.isStripOutlineVisible());
        assertTrue(l1.equals(l2));

        // stripOutlinePaint
        l1.setStripOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(l1.equals(l2));
        l2.setStripOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(l1.equals(l2));

        // stripOutlineStroke
        l1.setStripOutlineStroke(new BasicStroke(1.1f));
        assertFalse(l1.equals(l2));
        l2.setStripOutlineStroke(new BasicStroke(1.1f));
        assertTrue(l1.equals(l2));

        // backgroundPaint
        l1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(l1.equals(l2));
        l2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(l1.equals(l2));

        l1.setSubdivisionCount(99);
        assertFalse(l1.equals(l2));
        l2.setSubdivisionCount(99);
        assertTrue(l1.equals(l2));

    }

    