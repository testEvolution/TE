@Test
    public void testPublicCloneable() {
        XYSplineRenderer r1 = new XYSplineRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    