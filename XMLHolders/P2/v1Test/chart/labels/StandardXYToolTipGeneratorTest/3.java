@Test
    public void testPublicCloneable() {
        StandardXYToolTipGenerator g1 = new StandardXYToolTipGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    