@Test
    public void testPublicCloneable() {
        BoxAndWhiskerToolTipGenerator g1 = new BoxAndWhiskerToolTipGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    