@Test
    public void testCloning() {
        YWithXInterval i1 = new YWithXInterval(1.0, 0.5, 1.5);
        assertFalse(i1 instanceof Cloneable);
    }

    