@Test
    public void testPublicCloneable() {
        WindItemRenderer r1 = new WindItemRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    