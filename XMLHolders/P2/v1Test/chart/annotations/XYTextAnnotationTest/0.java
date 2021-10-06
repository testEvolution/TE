@Test
    public void testEquals() {
        XYTextAnnotation a1 = new XYTextAnnotation("Text", 10.0, 20.0);
        XYTextAnnotation a2 = new XYTextAnnotation("Text", 10.0, 20.0);
        assertTrue(a1.equals(a2));

        // text
        a1 = new XYTextAnnotation("ABC", 10.0, 20.0);
        assertFalse(a1.equals(a2));
        a2 = new XYTextAnnotation("ABC", 10.0, 20.0);
        assertTrue(a1.equals(a2));

        // x
        a1 = new XYTextAnnotation("ABC", 11.0, 20.0);
        assertFalse(a1.equals(a2));
        a2 = new XYTextAnnotation("ABC", 11.0, 20.0);
        assertTrue(a1.equals(a2));

        // y
        a1 = new XYTextAnnotation("ABC", 11.0, 22.0);
        assertFalse(a1.equals(a2));
        a2 = new XYTextAnnotation("ABC", 11.0, 22.0);
        assertTrue(a1.equals(a2));

        // font
        a1.setFont(new Font("Serif", Font.PLAIN, 23));
        assertFalse(a1.equals(a2));
        a2.setFont(new Font("Serif", Font.PLAIN, 23));
        assertTrue(a1.equals(a2));

        // paint
        GradientPaint gp1 = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW);
        GradientPaint gp2 = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW);
        a1.setPaint(gp1);
        assertFalse(a1.equals(a2));
        a2.setPaint(gp2);
        assertTrue(a1.equals(a2));

        // rotation anchor
        a1.setRotationAnchor(TextAnchor.BASELINE_RIGHT);
        assertFalse(a1.equals(a2));
        a2.setRotationAnchor(TextAnchor.BASELINE_RIGHT);
        assertTrue(a1.equals(a2));

        // rotation angle
        a1.setRotationAngle(12.3);
        assertFalse(a1.equals(a2));
        a2.setRotationAngle(12.3);
        assertTrue(a1.equals(a2));

        // text anchor
        a1.setTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertFalse(a1.equals(a2));
        a2.setTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertTrue(a1.equals(a2));

        a1.setBackgroundPaint(gp1);
        assertFalse(a1.equals(a2));
        a2.setBackgroundPaint(gp1);
        assertTrue(a1.equals(a2));

        a1.setOutlinePaint(gp1);
        assertFalse(a1.equals(a2));
        a2.setOutlinePaint(gp1);
        assertTrue(a1.equals(a2));

        a1.setOutlineStroke(new BasicStroke(1.2f));
        assertFalse(a1.equals(a2));
        a2.setOutlineStroke(new BasicStroke(1.2f));
        assertTrue(a1.equals(a2));

        a1.setOutlineVisible(!a1.isOutlineVisible());
        assertFalse(a1.equals(a2));
        a2.setOutlineVisible(a1.isOutlineVisible());
        assertTrue(a1.equals(a2));

    }

    