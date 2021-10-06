@Test
    public void testEquals() {
        DialBackground b1 = new DialBackground();
        DialBackground b2 = new DialBackground();
        assertTrue(b1.equals(b2));

        // paint
        b1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.YELLOW));
        assertFalse(b1.equals(b2));
        b2.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.YELLOW));
        assertTrue(b1.equals(b2));

        // gradient paint transformer
        b1.setGradientPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));
        assertFalse(b1.equals(b2));
        b2.setGradientPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));
        assertTrue(b1.equals(b2));

        // check an inherited attribute
        b1.setVisible(false);
        assertFalse(b1.equals(b2));
        b2.setVisible(false);
        assertTrue(b1.equals(b2));

    }

    