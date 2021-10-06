@Test
    public void testPublicCloneable() {
        CustomPieURLGenerator g1 = new CustomPieURLGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    