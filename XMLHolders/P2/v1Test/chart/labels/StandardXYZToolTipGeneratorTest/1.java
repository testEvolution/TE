@Test
    public void testHashCode() {
        StandardXYZToolTipGenerator g1
                = new StandardXYZToolTipGenerator();
        StandardXYZToolTipGenerator g2
                = new StandardXYZToolTipGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    