@Test
    public void testSerialization() {
        Stroke stroke1 = new BasicStroke(2.0f);
        XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] {1.0,
                2.0, 3.0, 4.0, 5.0, 6.0}, stroke1, Color.RED, Color.BLUE);
        XYPolygonAnnotation a2 = (XYPolygonAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}