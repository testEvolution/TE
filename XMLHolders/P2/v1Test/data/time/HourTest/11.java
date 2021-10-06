@Test
    public void testFirstHourNext() {
        Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900));
        Hour next = (Hour) first.next();
        assertEquals(1, next.getHour());
        assertEquals(1900, next.getYear());
    }

    