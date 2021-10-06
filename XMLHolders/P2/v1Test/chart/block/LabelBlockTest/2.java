@Test
    public void testSerialization() {
        GradientPaint gp = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE);
        LabelBlock b1 = new LabelBlock("ABC", new Font("Dialog",
                Font.PLAIN, 12), gp);
        LabelBlock b2 = (LabelBlock) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}