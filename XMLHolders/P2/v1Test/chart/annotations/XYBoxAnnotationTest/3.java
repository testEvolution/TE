@Test
    public void testPublicCloneable() {
        XYBoxAnnotation a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0,
                new BasicStroke(1.2f), Color.RED, Color.BLUE);
        assertTrue(a1 instanceof PublicCloneable);
    }

    