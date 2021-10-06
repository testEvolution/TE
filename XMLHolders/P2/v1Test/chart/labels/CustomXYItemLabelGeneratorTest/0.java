@Test
    public void testCloning() throws CloneNotSupportedException {
        CustomXYToolTipGenerator g1 = new CustomXYToolTipGenerator();
        CustomXYToolTipGenerator g2 = (CustomXYToolTipGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    