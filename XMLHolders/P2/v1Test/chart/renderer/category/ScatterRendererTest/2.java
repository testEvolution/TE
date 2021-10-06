@Test
    public void testCloning() throws CloneNotSupportedException {
        ScatterRenderer r1 = new ScatterRenderer();
        ScatterRenderer r2 = (ScatterRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        assertTrue(checkIndependence(r1, r2));
    }

    