@Test
    public void testCloning() throws CloneNotSupportedException {
        BoxAndWhiskerXYToolTipGenerator g1
                = new BoxAndWhiskerXYToolTipGenerator();
        BoxAndWhiskerXYToolTipGenerator g2 = (BoxAndWhiskerXYToolTipGenerator) 
                g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    