@Test
    public void testPublicCloneable() {
        XYPointerAnnotation a1 = new XYPointerAnnotation("Label", 10.0, 20.0,
                Math.PI);
        assertTrue(a1 instanceof PublicCloneable);
    }

    