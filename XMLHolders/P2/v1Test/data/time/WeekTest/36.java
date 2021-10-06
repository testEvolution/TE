private void testWeekYearConstructorWithCustomCalendar(int hoursOffset, String locale, int secondWeekOffsetInDays,
                                                       BiConsumer<Integer, String> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset, locale);
            long ms = secondWeekOffsetInDays * 86_400_000L - 3_600_000L * hoursOffset;
            Week w = new Week(2, new Year(1970));
            assertEquals(1970, w.getYear().getYear());
            assertEquals(2, w.getWeek());
            assertEquals(ms, w.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    