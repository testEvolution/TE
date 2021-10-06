@Test
    public void testParseHour() {
        // test 1...
        Hour h = Hour.parseHour("2002-01-29 13");
        assertEquals(13, h.getHour());
    }

    