@Test
    public void testEquals() {
        BarRenderer r1 = new BarRenderer();
        BarRenderer r2 = new BarRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        // base value
        r1.setBase(0.123);
        assertFalse(r1.equals(r2));
        r2.setBase(0.123);
        assertTrue(r1.equals(r2));

        // itemMargin
        r1.setItemMargin(0.22);
        assertFalse(r1.equals(r2));
        r2.setItemMargin(0.22);
        assertTrue(r1.equals(r2));

        // drawBarOutline
        r1.setDrawBarOutline(!r1.isDrawBarOutline());
        assertFalse(r1.equals(r2));
        r2.setDrawBarOutline(!r2.isDrawBarOutline());
        assertTrue(r1.equals(r2));

        // maximumBarWidth
        r1.setMaximumBarWidth(0.11);
        assertFalse(r1.equals(r2));
        r2.setMaximumBarWidth(0.11);
        assertTrue(r1.equals(r2));

        // minimumBarLength
        r1.setMinimumBarLength(0.04);
        assertFalse(r1.equals(r2));
        r2.setMinimumBarLength(0.04);
        assertTrue(r1.equals(r2));

        // gradientPaintTransformer
        r1.setGradientPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));
        assertFalse(r1.equals(r2));
        r2.setGradientPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));
        assertTrue(r1.equals(r2));

        // positiveItemLabelPositionFallback
        r1.setPositiveItemLabelPositionFallback(new ItemLabelPosition(
                ItemLabelAnchor.INSIDE1, TextAnchor.CENTER));
        assertFalse(r1.equals(r2));
        r2.setPositiveItemLabelPositionFallback(new ItemLabelPosition(
                ItemLabelAnchor.INSIDE1, TextAnchor.CENTER));
        assertTrue(r1.equals(r2));

        // negativeItemLabelPositionFallback
        r1.setNegativeItemLabelPositionFallback(new ItemLabelPosition(
                ItemLabelAnchor.INSIDE1, TextAnchor.CENTER));
        assertFalse(r1.equals(r2));
        r2.setNegativeItemLabelPositionFallback(new ItemLabelPosition(
                ItemLabelAnchor.INSIDE1, TextAnchor.CENTER));
        assertTrue(r1.equals(r2));

        // barPainter
        r1.setBarPainter(new GradientBarPainter(0.1, 0.2, 0.3));
        assertFalse(r1.equals(r2));
        r2.setBarPainter(new GradientBarPainter(0.1, 0.2, 0.3));
        assertTrue(r1.equals(r2));

        // shadowsVisible
        r1.setShadowVisible(false);
        assertFalse(r1.equals(r2));
        r2.setShadowVisible(false);
        assertTrue(r1.equals(r2));

        r1.setShadowPaint(Color.RED);
        assertFalse(r1.equals(r2));
        r2.setShadowPaint(Color.RED);
        assertTrue(r1.equals(r2));

        // shadowXOffset
        r1.setShadowXOffset(3.3);
        assertFalse(r1.equals(r2));
        r2.setShadowXOffset(3.3);
        assertTrue(r1.equals(r2));

        // shadowYOffset
        r1.setShadowYOffset(3.3);
        assertFalse(r1.equals(r2));
        r2.setShadowYOffset(3.3);
        assertTrue(r1.equals(r2));

    }

    