private void testDMYConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Day d = new Day(1, 1, 1970);
            assertEquals(1970, d.getYear());
            assertEquals(1, d.getMonth());
            assertEquals(1, d.getDayOfMonth());
            assertEquals(-3_600_000L * hoursOffset, d.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    