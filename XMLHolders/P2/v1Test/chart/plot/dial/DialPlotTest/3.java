@Test
    public void testCloning() throws CloneNotSupportedException {
        DialPlot p1 = new DialPlot();
        DialPlot p2 = (DialPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));
    }


    