@Test
    public void testHashCode() {
        StandardPieToolTipGenerator g1
                = new StandardPieToolTipGenerator();
        StandardPieToolTipGenerator g2
                = new StandardPieToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    