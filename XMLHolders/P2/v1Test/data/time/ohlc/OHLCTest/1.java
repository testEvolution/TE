@Test
    public void testCloning() {
        OHLC i1 = new OHLC(2.0, 4.0, 1.0, 3.0);
        assertFalse(i1 instanceof Cloneable);
    }

    