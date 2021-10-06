@Test
    public void testCloning() throws CloneNotSupportedException {
        PiePlot p1 = new PiePlot();
        PiePlot p2 = (PiePlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));
    }

    