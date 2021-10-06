@Test
    public void testCloning() throws CloneNotSupportedException {
        XYShapeRenderer r1 = new XYShapeRenderer();
        XYShapeRenderer r2 = (XYShapeRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    