@Test
    public void testPublicCloneable() {
        XYTextAnnotation a1 = new XYTextAnnotation("Text", 10.0, 20.0);
        assertTrue(a1 instanceof PublicCloneable);
    }

    