private void testHourDayConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = -3_600_000L * hoursOffset;
            Hour h = new Hour(0, new Day(new Date(ms)));
            assertEquals(1970, h.getYear());
            assertEquals(1, h.getMonth());
            assertEquals(1, h.getDayOfMonth());
            assertEquals(0, h.getHour());
            assertEquals(ms, h.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    