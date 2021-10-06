private void testNextWithCustomCalendar(int hoursOffset, Consumer<Integer> calendarSetup) {
        try {
            calendarSetup.accept(hoursOffset);
            Millisecond m = new Millisecond(new Date(0L));
            m = (Millisecond) m.next();
            assertEquals(1970, m.getSecond().getMinute().getHour().getYear());
            assertEquals(1, m.getSecond().getMinute().getHour().getMonth());
            assertEquals(1, m.getSecond().getMinute().getHour().getDayOfMonth());
            assertEquals(hoursOffset, m.getSecond().getMinute().getHour().getHour());
            assertEquals(0, m.getSecond().getMinute().getMinute());
            assertEquals(0, m.getSecond().getSecond());
            assertEquals(1L, m.getMillisecond());
            assertEquals(1L, m.getFirstMillisecond());
        } finally {
            // reset everything, to avoid affecting other tests
            RegularTimePeriod.setThreadLocalCalendarInstance(null);
            RegularTimePeriod.setCalendarInstancePrototype(null);
        }
    }

    