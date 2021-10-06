@Test
    public void testSerialization() {
        OHLC i1 = new OHLC(2.0, 4.0, 1.0, 3.0);
        OHLC i2 = (OHLC) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

    