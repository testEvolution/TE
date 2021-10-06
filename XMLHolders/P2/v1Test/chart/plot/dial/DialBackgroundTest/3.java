@Test
    public void testSerialization() {
        // test a default instance
        DialBackground b1 = new DialBackground();
        DialBackground b2 = (DialBackground) TestUtils.serialised(b1);
        assertEquals(b1, b2);

        // test a customised instance
        b1 = new DialBackground();
        b1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.GREEN));
        b1.setGradientPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));

        b2 = (DialBackground) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}