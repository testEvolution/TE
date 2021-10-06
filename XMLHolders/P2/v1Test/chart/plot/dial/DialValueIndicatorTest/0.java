@Test
    public void testEquals() {
        DialValueIndicator i1 = new DialValueIndicator(0);
        DialValueIndicator i2 = new DialValueIndicator(0);
        assertTrue(i1.equals(i2));

        // dataset index
        i1.setDatasetIndex(99);
        assertFalse(i1.equals(i2));
        i2.setDatasetIndex(99);
        assertTrue(i1.equals(i2));

        // angle
        i1.setAngle(43);
        assertFalse(i1.equals(i2));
        i2.setAngle(43);
        assertTrue(i1.equals(i2));

        // radius
        i1.setRadius(0.77);
        assertFalse(i1.equals(i2));
        i2.setRadius(0.77);
        assertTrue(i1.equals(i2));

        // frameAnchor
        i1.setFrameAnchor(RectangleAnchor.TOP_LEFT);
        assertFalse(i1.equals(i2));
        i2.setFrameAnchor(RectangleAnchor.TOP_LEFT);
        assertTrue(i1.equals(i2));

        // templateValue
        i1.setTemplateValue(1.23);
        assertFalse(i1.equals(i2));
        i2.setTemplateValue(1.23);
        assertTrue(i1.equals(i2));

        // font
        i1.setFont(new Font("Dialog", Font.PLAIN, 7));
        assertFalse(i1.equals(i2));
        i2.setFont(new Font("Dialog", Font.PLAIN, 7));
        assertTrue(i1.equals(i2));

        // paint
        i1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.GREEN));
        assertFalse(i1.equals(i2));
        i2.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.GREEN));
        assertTrue(i1.equals(i2));

        // backgroundPaint
        i1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.GREEN));
        assertFalse(i1.equals(i2));
        i2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.GREEN));
        assertTrue(i1.equals(i2));

        // outlineStroke
        i1.setOutlineStroke(new BasicStroke(1.1f));
        assertFalse(i1.equals(i2));
        i2.setOutlineStroke(new BasicStroke(1.1f));
        assertTrue(i1.equals(i2));

        // outlinePaint
        i1.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.GREEN));
        assertFalse(i1.equals(i2));
        i2.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.GREEN));
        assertTrue(i1.equals(i2));

        // insets
        i1.setInsets(new RectangleInsets(1, 2, 3, 4));
        assertFalse(i1.equals(i2));
        i2.setInsets(new RectangleInsets(1, 2, 3, 4));
        assertTrue(i1.equals(i2));

        // valueAnchor
        i1.setValueAnchor(RectangleAnchor.BOTTOM_LEFT);
        assertFalse(i1.equals(i2));
        i2.setValueAnchor(RectangleAnchor.BOTTOM_LEFT);
        assertTrue(i1.equals(i2));

        // textAnchor
        i1.setTextAnchor(TextAnchor.TOP_LEFT);
        assertFalse(i1.equals(i2));
        i2.setTextAnchor(TextAnchor.TOP_LEFT);
        assertTrue(i1.equals(i2));

        // check an inherited attribute
        i1.setVisible(false);
        assertFalse(i1.equals(i2));
        i2.setVisible(false);
        assertTrue(i1.equals(i2));
    }

    