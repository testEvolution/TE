private void testNextWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            long ms = 86_400_000L - hoursOffset * 3_600_000L;
            Day d = new Day(new Date(ms));
            d = (Day) d.next();
            assertEquals(1970, d.getYear());
            assertEquals(1, d.getMonth());
            assertEquals(3, d.getDayOfMonth());
            assertEquals(ms + 86_400_000L, d.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    