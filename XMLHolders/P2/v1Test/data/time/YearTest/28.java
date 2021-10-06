private void testNextWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = -hoursOffset * 3_600_000L;
            Year y = new Year(new Date(ms));
            y = (Year) y.next();
            assertEquals(1971, y.getYear());
            assertEquals(ms + 86_400_000L * 365, y.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    