private void testDateConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = -3_600_000L * hoursOffset;
            Month m = new Month(new Date(ms));
            assertEquals(1970, m.getYear().getYear());
            assertEquals(1, m.getMonth());
            assertEquals(ms, m.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    