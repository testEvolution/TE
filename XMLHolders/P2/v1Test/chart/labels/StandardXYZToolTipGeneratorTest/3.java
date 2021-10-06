@Test
    public void testPublicCloneable() {
        StandardXYZToolTipGenerator g1 = new StandardXYZToolTipGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    