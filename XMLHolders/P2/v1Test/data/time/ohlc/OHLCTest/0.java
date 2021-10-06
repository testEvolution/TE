@Test
    public void testEquals() {
        OHLC i1 = new OHLC(2.0, 4.0, 1.0, 3.0);
        OHLC i2 = new OHLC(2.0, 4.0, 1.0, 3.0);
        assertEquals(i1, i2);

        i1 = new OHLC(2.2, 4.0, 1.0, 3.0);
        assertFalse(i1.equals(i2));
        i2 = new OHLC(2.2, 4.0, 1.0, 3.0);
        assertTrue(i1.equals(i2));

        i1 = new OHLC(2.2, 4.4, 1.0, 3.0);
        assertFalse(i1.equals(i2));
        i2 = new OHLC(2.2, 4.4, 1.0, 3.0);
        assertTrue(i1.equals(i2));

        i1 = new OHLC(2.2, 4.4, 1.1, 3.0);
        assertFalse(i1.equals(i2));
        i2 = new OHLC(2.2, 4.4, 1.1, 3.0);
        assertTrue(i1.equals(i2));

        i1 = new OHLC(2.2, 4.4, 1.1, 3.3);
        assertFalse(i1.equals(i2));
        i2 = new OHLC(2.2, 4.4, 1.1, 3.3);
        assertTrue(i1.equals(i2));
    }

    