@Test
    public void testPublicCloneable() {
        XYStepRenderer r1 = new XYStepRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    