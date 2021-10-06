@Test
    public void testPublicCloneable() {
        WaterfallBarRenderer r1 = new WaterfallBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    