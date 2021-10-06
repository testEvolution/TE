@Test
    public void testPublicCloneable() {
        CustomXYURLGenerator g1 = new CustomXYURLGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    