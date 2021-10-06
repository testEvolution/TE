@Test
    public void testPublicCloneable() {
        XYDotRenderer r1 = new XYDotRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    