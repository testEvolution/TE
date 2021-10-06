@Test
    public void testSerialization() {
        BlockBorder b1 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0,
                4.0), new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.YELLOW));
        BlockBorder b2 = (BlockBorder) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}