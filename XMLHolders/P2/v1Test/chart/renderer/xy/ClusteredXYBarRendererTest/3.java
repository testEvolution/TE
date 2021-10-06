@Test
    public void testPublicCloneable() {
        ClusteredXYBarRenderer r1 = new ClusteredXYBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    