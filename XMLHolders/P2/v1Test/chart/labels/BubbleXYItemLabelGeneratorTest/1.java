@Test
    public void testHashCode() {
        BubbleXYItemLabelGenerator g1
                = new BubbleXYItemLabelGenerator();
        BubbleXYItemLabelGenerator g2
                = new BubbleXYItemLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    