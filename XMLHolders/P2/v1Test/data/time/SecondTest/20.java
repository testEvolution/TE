@Test
    public void testNext() {
        Second s = new Second(55, 30, 1, 12, 12, 2000);
        s = (Second) s.next();
        assertEquals(2000, s.getMinute().getHour().getYear());
        assertEquals(12, s.getMinute().getHour().getMonth());
        assertEquals(12, s.getMinute().getHour().getDayOfMonth());
        assertEquals(1, s.getMinute().getHour().getHour());
        assertEquals(30, s.getMinute().getMinute());
        assertEquals(56, s.getSecond());
        s = new Second(59, 59, 23, 31, 12, 9999);
        assertNull(s.next());
    }

    