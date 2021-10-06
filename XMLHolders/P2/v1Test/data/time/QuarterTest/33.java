private void testNextWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = -hoursOffset * 3_600_000L;
            Quarter q = new Quarter(new Date(ms));
            q = (Quarter) q.next();
            assertEquals(1970, q.getYear().getYear());
            assertEquals(2, q.getQuarter());
            assertEquals(ms + 86_400_000L * (31 + 28 + 31), q.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    