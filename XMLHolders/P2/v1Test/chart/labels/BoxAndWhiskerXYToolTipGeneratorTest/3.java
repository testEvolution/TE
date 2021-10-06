@Test
    public void testPublicCloneable() {
        BoxAndWhiskerXYToolTipGenerator g1
                = new BoxAndWhiskerXYToolTipGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    