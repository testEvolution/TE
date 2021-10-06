@Test
    public void testCloning() throws CloneNotSupportedException {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = (StatisticalBarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    