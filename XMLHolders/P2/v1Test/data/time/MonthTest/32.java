private void testNextWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = -hoursOffset * 3_600_000L;
            Month m = new Month(new Date(ms));
            m = (Month) m.next();
            assertEquals(1970, m.getYear().getYear());
            assertEquals(2, m.getMonth());
            assertEquals(ms + 86_400_000L * 31, m.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    