@Test
    public void testSerialization() {
        XYPointerAnnotation a1 = new XYPointerAnnotation("Label", 10.0, 20.0,
                Math.PI);
        XYPointerAnnotation a2 = (XYPointerAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}