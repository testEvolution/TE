@Test
    public void testSerialization() {
        GradientPaint gp = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE);
        ColorBlock b1 = new ColorBlock(gp, 1.0, 2.0);
        ColorBlock b2 = (ColorBlock) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}