@Test
    public void testHashCode() {
        StandardXYItemLabelGenerator g1
                = new StandardXYItemLabelGenerator();
        StandardXYItemLabelGenerator g2
                = new StandardXYItemLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    