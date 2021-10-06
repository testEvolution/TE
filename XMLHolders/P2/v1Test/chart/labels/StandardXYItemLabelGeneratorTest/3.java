@Test
    public void testPublicCloneable() {
        StandardXYItemLabelGenerator g1 = new StandardXYItemLabelGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    