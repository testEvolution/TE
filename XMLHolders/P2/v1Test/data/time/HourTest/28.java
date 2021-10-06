private void testNextWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Hour h = new Hour(new Date(0L));
            h = (Hour) h.next();
            assertEquals(1970, h.getYear());
            assertEquals(1, h.getMonth());
            assertEquals(1, h.getDayOfMonth());
            assertEquals(hoursOffset + 1, h.getHour());
            assertEquals(3_600_000L, h.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    