@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardXYZToolTipGenerator g1 = new StandardXYZToolTipGenerator();
        StandardXYZToolTipGenerator g2 = (StandardXYZToolTipGenerator) 
                g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    