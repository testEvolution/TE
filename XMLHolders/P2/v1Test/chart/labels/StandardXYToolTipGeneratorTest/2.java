@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardXYToolTipGenerator g1 = new StandardXYToolTipGenerator();
        StandardXYToolTipGenerator g2 = (StandardXYToolTipGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    