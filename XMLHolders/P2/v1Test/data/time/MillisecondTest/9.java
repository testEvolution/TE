private void testMillisecondSecondConstructorWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Millisecond m = new Millisecond(0, new Second(new Date(0L)));
            assertEquals(1970, m.getSecond().getMinute().getHour().getYear());
            assertEquals(1, m.getSecond().getMinute().getHour().getMonth());
            assertEquals(1, m.getSecond().getMinute().getHour().getDayOfMonth());
            assertEquals(hoursOffset, m.getSecond().getMinute().getHour().getHour());
            assertEquals(0, m.getSecond().getMinute().getMinute());
            assertEquals(0, m.getSecond().getSecond());
            assertEquals(0, m.getMillisecond());
            assertEquals(0L, m.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    