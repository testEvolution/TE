@Test
    public void testPublicCloneable() {
        DeviationStepRenderer r1 = new DeviationStepRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    