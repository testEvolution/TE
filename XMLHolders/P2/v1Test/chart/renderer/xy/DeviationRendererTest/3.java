@Test
    public void testPublicCloneable() {
        DeviationRenderer r1 = new DeviationRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    