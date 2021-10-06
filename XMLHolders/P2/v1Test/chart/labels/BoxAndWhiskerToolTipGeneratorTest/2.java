@Test
    public void testCloning() throws CloneNotSupportedException {
        BoxAndWhiskerToolTipGenerator g1 = new BoxAndWhiskerToolTipGenerator();
        BoxAndWhiskerToolTipGenerator g2 = (BoxAndWhiskerToolTipGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    