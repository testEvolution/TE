@Test
    public void testPublicCloneable() {
        IntervalBarRenderer r1 = new IntervalBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    