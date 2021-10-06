@Test
    public void testPublicCloneable() {
        LevelRenderer r1 = new LevelRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    