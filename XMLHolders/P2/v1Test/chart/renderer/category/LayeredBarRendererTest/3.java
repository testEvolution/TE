@Test
    public void testPublicCloneable() {
        LayeredBarRenderer r1 = new LayeredBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    