@Test
    public void testCloning() throws CloneNotSupportedException {
        StatisticalLineAndShapeRenderer r1
                = new StatisticalLineAndShapeRenderer();
        StatisticalLineAndShapeRenderer r2 = (StatisticalLineAndShapeRenderer) 
                r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    