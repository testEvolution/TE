@Test
    public void testHashCode() {
        XYDrawableAnnotation a1 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        XYDrawableAnnotation a2 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    