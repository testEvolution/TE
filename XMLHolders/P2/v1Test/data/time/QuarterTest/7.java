private void testDateConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = -3_600_000L * hoursOffset;
            Quarter q = new Quarter(new Date(ms));
            assertEquals(1970, q.getYear().getYear());
            assertEquals(1, q.getQuarter());
            assertEquals(ms, q.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    