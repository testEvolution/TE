@Test
    public void testPublicCloneable() {
        StackedXYBarRenderer r1 = new StackedXYBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    