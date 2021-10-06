@Test
    public void testNext() {
        Millisecond m = new Millisecond(555, 55, 30, 1, 12, 12, 2000);
        m = (Millisecond) m.next();
        assertEquals(2000, m.getSecond().getMinute().getHour().getYear());
        assertEquals(12, m.getSecond().getMinute().getHour().getMonth());
        assertEquals(12, m.getSecond().getMinute().getHour().getDayOfMonth());
        assertEquals(1, m.getSecond().getMinute().getHour().getHour());
        assertEquals(30, m.getSecond().getMinute().getMinute());
        assertEquals(55, m.getSecond().getSecond());
        assertEquals(556, m.getMillisecond());
        m = new Millisecond(999, 59, 59, 23, 31, 12, 9999);
        assertNull(m.next());
    }

    