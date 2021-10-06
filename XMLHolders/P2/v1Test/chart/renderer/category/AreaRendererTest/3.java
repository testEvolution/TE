@Test
    public void testPublicCloneable() {
        AreaRenderer r1 = new AreaRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    