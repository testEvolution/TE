@Test
    public void testPublicCloneable() {
        CustomXYToolTipGenerator g1 = new CustomXYToolTipGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    