@Test
    public void testEquals() {

        Marker m1 = new ValueMarker(45.0);
        Marker m2 = new ValueMarker(45.0);
        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1));

        m1.setPaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.RED));
        assertFalse(m1.equals(m2));
        m2.setPaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.RED));
        assertTrue(m1.equals(m2));

        BasicStroke stroke = new BasicStroke(2.2f);
        m1.setStroke(stroke);
        assertFalse(m1.equals(m2));
        m2.setStroke(stroke);
        assertTrue(m1.equals(m2));

        m1.setOutlinePaint(new GradientPaint(4.0f, 3.0f, Color.YELLOW,
                2.0f, 1.0f, Color.WHITE));
        assertFalse(m1.equals(m2));
        m2.setOutlinePaint(new GradientPaint(4.0f, 3.0f, Color.YELLOW,
                2.0f, 1.0f, Color.WHITE));
        assertTrue(m1.equals(m2));

        m1.setOutlineStroke(stroke);
        assertFalse(m1.equals(m2));
        m2.setOutlineStroke(stroke);
        assertTrue(m1.equals(m2));

        m1.setAlpha(0.1f);
        assertFalse(m1.equals(m2));
        m2.setAlpha(0.1f);
        assertTrue(m1.equals(m2));

        m1.setLabel("New Label");
        assertFalse(m1.equals(m2));
        m2.setLabel("New Label");
        assertTrue(m1.equals(m2));

        m1.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        assertFalse(m1.equals(m2));
        m2.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        assertTrue(m1.equals(m2));

        m1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(m1.equals(m2));
        m2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(m1.equals(m2));

        m1.setLabelAnchor(RectangleAnchor.TOP_RIGHT);
        assertFalse(m1.equals(m2));
        m2.setLabelAnchor(RectangleAnchor.TOP_RIGHT);
        assertTrue(m1.equals(m2));

        m1.setLabelTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertFalse(m1.equals(m2));
        m2.setLabelTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertTrue(m1.equals(m2));

        m1.setLabelOffset(new RectangleInsets(10.0, 10.0, 10.0, 10.0));
        assertFalse(m1.equals(m2));
        m2.setLabelOffset(new RectangleInsets(10.0, 10.0, 10.0, 10.0));
        assertTrue(m1.equals(m2));

        m1.setLabelOffsetType(LengthAdjustmentType.EXPAND);
        assertFalse(m1.equals(m2));
        m2.setLabelOffsetType(LengthAdjustmentType.EXPAND);
        assertTrue(m1.equals(m2));

        m1 = new ValueMarker(12.3);
        m2 = new ValueMarker(45.6);
        assertFalse(m1.equals(m2));
        m2 = new ValueMarker(12.3);
        assertTrue(m1.equals(m2));

    }

    