private void testNextWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Second s = new Second(new Date(0L));
            s = (Second) s.next();
            assertEquals(1970, s.getMinute().getHour().getYear());
            assertEquals(1, s.getMinute().getHour().getMonth());
            assertEquals(1, s.getMinute().getHour().getDayOfMonth());
            assertEquals(hoursOffset, s.getMinute().getHour().getHour());
            assertEquals(0, s.getMinute().getMinute());
            assertEquals(1, s.getSecond());
            assertEquals(1000L, s.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    