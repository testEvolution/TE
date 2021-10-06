@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardPieToolTipGenerator g1 = new StandardPieToolTipGenerator();
        StandardPieToolTipGenerator g2 = (StandardPieToolTipGenerator) 
                g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
        assertTrue(g1.getNumberFormat() != g2.getNumberFormat());
        assertTrue(g1.getPercentFormat() != g2.getPercentFormat());
    }

    