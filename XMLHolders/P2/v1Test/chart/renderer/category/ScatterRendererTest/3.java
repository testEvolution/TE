@Test
    public void testPublicCloneable() {
        ScatterRenderer r1 = new ScatterRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    