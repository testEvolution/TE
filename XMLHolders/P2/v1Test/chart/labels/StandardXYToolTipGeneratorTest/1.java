@Test
    public void testHashCode() {
        StandardXYToolTipGenerator g1
                = new StandardXYToolTipGenerator();
        StandardXYToolTipGenerator g2
                = new StandardXYToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    