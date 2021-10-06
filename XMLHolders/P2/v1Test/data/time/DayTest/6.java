private void testDateConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = 86_400_000L - 3_600_000L * hoursOffset;
            Day d = new Day(new Date(ms));
            assertEquals(1970, d.getYear());
            assertEquals(1, d.getMonth());
            assertEquals(2, d.getDayOfMonth());
            assertEquals(ms, d.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    