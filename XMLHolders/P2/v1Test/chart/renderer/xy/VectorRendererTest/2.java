@Test
    public void testCloning() throws CloneNotSupportedException {
        VectorRenderer r1 = new VectorRenderer();
        VectorRenderer r2 = (VectorRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    