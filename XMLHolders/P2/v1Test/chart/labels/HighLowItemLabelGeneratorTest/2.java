@Test
    public void testCloning() throws CloneNotSupportedException {
        HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator();
        HighLowItemLabelGenerator g2 = (HighLowItemLabelGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    