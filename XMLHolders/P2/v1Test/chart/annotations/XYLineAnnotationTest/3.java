@Test
    public void testPublicCloneable() {
        Stroke stroke = new BasicStroke(2.0f);
        XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0,
                stroke, Color.BLUE);
        assertTrue(a1 instanceof PublicCloneable);
    }

    