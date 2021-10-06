@Test
    public void testPublicCloneable() {
        StackedAreaRenderer r1 = new StackedAreaRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    