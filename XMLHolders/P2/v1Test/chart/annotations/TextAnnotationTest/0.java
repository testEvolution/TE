@Test
    public void testEquals() {
        TextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0);
        TextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0);
        assertTrue(a1.equals(a2));

        // text
        a1.setText("Text");
        assertFalse(a1.equals(a2));
        a2.setText("Text");
        assertTrue(a1.equals(a2));

        // font
        a1.setFont(new Font("Serif", Font.BOLD, 18));
        assertFalse(a1.equals(a2));
        a2.setFont(new Font("Serif", Font.BOLD, 18));
        assertTrue(a1.equals(a2));

        // paint
        a1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.pink));
        assertFalse(a1.equals(a2));
        a2.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.pink));
        assertTrue(a1.equals(a2));

        // textAnchor
        a1.setTextAnchor(TextAnchor.BOTTOM_LEFT);
        assertFalse(a1.equals(a2));
        a2.setTextAnchor(TextAnchor.BOTTOM_LEFT);
        assertTrue(a1.equals(a2));

        // rotationAnchor
        a1.setRotationAnchor(TextAnchor.BOTTOM_LEFT);
        assertFalse(a1.equals(a2));
        a2.setRotationAnchor(TextAnchor.BOTTOM_LEFT);
        assertTrue(a1.equals(a2));

        // rotationAngle
        a1.setRotationAngle(Math.PI);
        assertFalse(a1.equals(a2));
        a2.setRotationAngle(Math.PI);
        assertTrue(a1.equals(a2));
    }

    