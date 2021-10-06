@Test
    public void testCloning() throws CloneNotSupportedException {
        FastScatterPlot p1 = new FastScatterPlot();
        FastScatterPlot p2 = (FastScatterPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));
    }

    