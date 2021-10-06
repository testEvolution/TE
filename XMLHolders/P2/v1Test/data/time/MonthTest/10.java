private void testMonthIntYearConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Month m = new Month(1, 1970);
            assertEquals(1970, m.getYear().getYear());
            assertEquals(1, m.getMonth());
            assertEquals(-3_600_000L * hoursOffset, m.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    