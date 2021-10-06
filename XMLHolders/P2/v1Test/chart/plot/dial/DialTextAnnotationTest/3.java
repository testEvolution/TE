@Test
    public void testSerialization() {
        // test a default instance
        DialTextAnnotation a1 = new DialTextAnnotation("A1");
        DialTextAnnotation a2 = (DialTextAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);

        // test a custom instance
        a1 = new DialTextAnnotation("A1");
        a1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));

        a2 = (DialTextAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}