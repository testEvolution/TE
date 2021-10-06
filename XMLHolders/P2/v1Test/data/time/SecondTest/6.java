private void testDateConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Second s = new Second(new Date(0L));
            assertEquals(1970, s.getMinute().getHour().getYear());
            assertEquals(1, s.getMinute().getHour().getMonth());
            assertEquals(1, s.getMinute().getHour().getDayOfMonth());
            assertEquals(hoursOffset, s.getMinute().getHour().getHour());
            assertEquals(0, s.getMinute().getMinute());
            assertEquals(0, s.getSecond());
            assertEquals(0L, s.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    