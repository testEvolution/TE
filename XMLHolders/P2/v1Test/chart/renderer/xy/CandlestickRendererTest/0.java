@Test
    public void testConstructor() {
        CandlestickRenderer r1 = new CandlestickRenderer();

        // check defaults
        assertEquals(Color.GREEN, r1.getUpPaint());
        assertEquals(Color.RED, r1.getDownPaint());
        assertFalse(r1.getUseOutlinePaint());
        assertTrue(r1.getDrawVolume());
        assertEquals(Color.GRAY, r1.getVolumePaint());
        assertEquals(-1.0, r1.getCandleWidth(), EPSILON);
    }

    