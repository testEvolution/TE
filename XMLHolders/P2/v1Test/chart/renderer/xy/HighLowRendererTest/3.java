@Test
    public void testPublicCloneable() {
        HighLowRenderer r1 = new HighLowRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    