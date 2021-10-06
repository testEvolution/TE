@Test
    public void testSerialization() {
        XYTextAnnotation a1 = new XYTextAnnotation("Text", 10.0, 20.0);
        a1.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));
        XYTextAnnotation a2 = (XYTextAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}