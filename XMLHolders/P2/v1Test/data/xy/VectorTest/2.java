@Test
    public void testCloning() {
        Vector v1 = new Vector(1.0, 2.0);
        assertFalse(v1 instanceof Cloneable);
    }

    