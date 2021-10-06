@Test
    public void testHashCode() {
        TextTitle t = new TextTitle("Title");
        XYTitleAnnotation a1 = new XYTitleAnnotation(1.0, 2.0, t);
        XYTitleAnnotation a2 = new XYTitleAnnotation(1.0, 2.0, t);
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }
    
    