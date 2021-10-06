@Test
    public void testCloning() throws CloneNotSupportedException {
        XYPointerAnnotation a1 = new XYPointerAnnotation("Label", 10.0, 20.0,
                Math.PI);
        XYPointerAnnotation a2 = a2 = (XYPointerAnnotation) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    