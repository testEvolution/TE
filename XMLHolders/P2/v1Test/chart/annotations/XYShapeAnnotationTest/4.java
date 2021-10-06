@Test
    public void testSerialization() {
        XYShapeAnnotation a1 = new XYShapeAnnotation(
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(1.2f), Color.RED, Color.BLUE);
        XYShapeAnnotation a2 = (XYShapeAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}