@Test
    public void testPublicCloneable() {
        GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    