@Test
    public void testPublicCloneable() {
        StandardPieToolTipGenerator g1 = new StandardPieToolTipGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    