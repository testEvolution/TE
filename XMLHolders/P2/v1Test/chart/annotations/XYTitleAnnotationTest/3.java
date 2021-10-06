@Test
    public void testSerialization() {
        TextTitle t = new TextTitle("Title");
        XYTitleAnnotation a1 = new XYTitleAnnotation(1.0, 2.0, t);
        XYTitleAnnotation a2 = (XYTitleAnnotation) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }
    
    