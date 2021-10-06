@Test
    public void test943985() {
        Millisecond ms = new Millisecond(new java.util.Date(4));
        assertEquals(ms.getFirstMillisecond(), ms.getMiddleMillisecond());
        assertEquals(ms.getMiddleMillisecond(), ms.getLastMillisecond());
        ms = new Millisecond(new java.util.Date(5));
        assertEquals(ms.getFirstMillisecond(), ms.getMiddleMillisecond());
        assertEquals(ms.getMiddleMillisecond(), ms.getLastMillisecond());
    }

    