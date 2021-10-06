@Test
    public void testSerialization() {
        XYDrawableAnnotation a1 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        XYDrawableAnnotation a2 = (XYDrawableAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}