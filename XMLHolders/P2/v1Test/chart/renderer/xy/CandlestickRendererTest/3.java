@Test
    public void testCloning() throws CloneNotSupportedException {
        CandlestickRenderer r1 = new CandlestickRenderer();
        CandlestickRenderer r2 = (CandlestickRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    