@Test
    public void testPublicCloneable() {
        CategoryStepRenderer r1 = new CategoryStepRenderer(false);
        assertTrue(r1 instanceof PublicCloneable);
    }

    