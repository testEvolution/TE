@Test
    public void testCloning() {
        GridArrangement f1 = new GridArrangement(1, 2);
        assertFalse(f1 instanceof Cloneable);
    }

    