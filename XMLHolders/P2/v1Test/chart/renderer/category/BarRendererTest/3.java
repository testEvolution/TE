@Test
    public void testPublicCloneable() {
        BarRenderer r1 = new BarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    