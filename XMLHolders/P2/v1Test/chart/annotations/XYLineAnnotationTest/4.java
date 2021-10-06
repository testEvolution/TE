@Test
    public void testSerialization() {
        Stroke stroke = new BasicStroke(2.0f);
        XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0,
                stroke, Color.BLUE);
        XYLineAnnotation a2 = (XYLineAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}