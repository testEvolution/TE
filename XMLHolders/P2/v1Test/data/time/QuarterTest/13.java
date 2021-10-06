private void testQuarterYearConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Quarter q = new Quarter(1, new Year(1970));
            assertEquals(1970, q.getYear().getYear());
            assertEquals(1, q.getQuarter());
            assertEquals(-3_600_000L * hoursOffset, q.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    