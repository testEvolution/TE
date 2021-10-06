@Test
    public void testSerialization() {
        LineBorder b1 = new LineBorder(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(1.0f),
                new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        LineBorder b2 = (LineBorder) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}