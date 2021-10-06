@Test
    public void testCloning() throws CloneNotSupportedException {
        BubbleXYItemLabelGenerator g1 = new BubbleXYItemLabelGenerator();
        BubbleXYItemLabelGenerator g2 = (BubbleXYItemLabelGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    