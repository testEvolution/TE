@Test
    public void testCloning() {
        BorderArrangement b1 = new BorderArrangement();
        assertFalse(b1 instanceof Cloneable);
    }

    