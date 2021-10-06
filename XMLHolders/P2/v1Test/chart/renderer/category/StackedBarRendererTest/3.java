@Test
    public void testPublicCloneable() {
        StackedBarRenderer r1 = new StackedBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    