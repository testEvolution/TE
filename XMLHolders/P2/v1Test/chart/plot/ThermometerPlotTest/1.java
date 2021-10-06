@Test
    public void testCloning() throws CloneNotSupportedException {
        ThermometerPlot p1 = new ThermometerPlot();
        ThermometerPlot p2 = (ThermometerPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));
    }

    