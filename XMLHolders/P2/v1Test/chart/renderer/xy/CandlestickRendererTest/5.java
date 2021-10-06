@Test
    public void testSerialization() {
        CandlestickRenderer r1 = new CandlestickRenderer();
        CandlestickRenderer r2 = (CandlestickRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    