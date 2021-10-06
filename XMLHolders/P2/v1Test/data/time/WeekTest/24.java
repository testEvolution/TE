private void testNextWithCustomCalendar(int hoursOffset, String locale,
                                            int secondWeekOffsetInDays,
                                            BiConsumer<Integer, String> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset, locale);
            long ms = secondWeekOffsetInDays * 86_400_000L - hoursOffset * 3_600_000L;
            Week w = new Week(new Date(ms));
            w = (Week) w.next();
            assertEquals(1970, w.getYear().getYear());
            assertEquals(3, w.getWeek());
            assertEquals(ms + 86_400_000L * 7, w.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    