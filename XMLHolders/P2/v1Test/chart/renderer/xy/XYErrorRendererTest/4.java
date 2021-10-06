@Test
    public void testPublicCloneable() {
        XYErrorRenderer r1 = new XYErrorRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    