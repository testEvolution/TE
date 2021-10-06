private void testDateConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Hour h = new Hour(new Date(0L));
            assertEquals(1970, h.getYear());
            assertEquals(1, h.getMonth());
            assertEquals(1, h.getDayOfMonth());
            assertEquals(hoursOffset, h.getHour());
            assertEquals(0L, h.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    