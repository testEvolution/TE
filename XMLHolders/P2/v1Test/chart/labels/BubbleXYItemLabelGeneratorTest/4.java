@Test
    public void testSerialization() {
        BubbleXYItemLabelGenerator g1 = new BubbleXYItemLabelGenerator();
        BubbleXYItemLabelGenerator g2 = (BubbleXYItemLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    