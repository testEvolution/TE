@Test
    public void testPublicCloneable() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    