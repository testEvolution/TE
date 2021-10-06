@Test
    public void testCloning() {
        XYCoordinate v1 = new XYCoordinate(1.0, 2.0);
        assertFalse(v1 instanceof Cloneable);
    }

    