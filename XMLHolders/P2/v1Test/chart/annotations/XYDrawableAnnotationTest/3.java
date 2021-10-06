@Test
    public void testEquals() {
        XYDrawableAnnotation a1 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        XYDrawableAnnotation a2 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        assertTrue(a1.equals(a2));

        a1 = new XYDrawableAnnotation(11.0, 20.0, 100.0, 200.0,
                new TestDrawable());
        assertFalse(a1.equals(a2));
        a2 = new XYDrawableAnnotation(11.0, 20.0, 100.0, 200.0,
                new TestDrawable());
        assertTrue(a1.equals(a2));

        a1 = new XYDrawableAnnotation(11.0, 22.0, 100.0, 200.0,
                new TestDrawable());
        assertFalse(a1.equals(a2));
        a2 = new XYDrawableAnnotation(11.0, 22.0, 100.0, 200.0,
                new TestDrawable());
        assertTrue(a1.equals(a2));

        a1 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 200.0,
                new TestDrawable());
        assertFalse(a1.equals(a2));
        a2 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 200.0,
                new TestDrawable());
        assertTrue(a1.equals(a2));

        a1 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0,
                new TestDrawable());
        assertFalse(a1.equals(a2));
        a2 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0,
                new TestDrawable());
        assertTrue(a1.equals(a2));

        a1 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0, 2.0,
                new TestDrawable());
        assertFalse(a1.equals(a2));
        a2 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0, 2.0,
                new TestDrawable());
        assertTrue(a1.equals(a2));
    }

    