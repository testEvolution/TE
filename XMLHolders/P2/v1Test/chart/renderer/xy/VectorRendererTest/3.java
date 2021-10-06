@Test
    public void testPublicCloneable() {
        VectorRenderer r1 = new VectorRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    