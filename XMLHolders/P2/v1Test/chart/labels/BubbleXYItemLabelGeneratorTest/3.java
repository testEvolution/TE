@Test
    public void testPublicCloneable() {
        BubbleXYItemLabelGenerator g1 = new BubbleXYItemLabelGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    