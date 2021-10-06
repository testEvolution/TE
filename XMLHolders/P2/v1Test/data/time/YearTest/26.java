@Test
    public void testNextWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testNextWithCustomCalendar(3, calendarSetup);
        testNextWithCustomCalendar(4, calendarSetup);
    }

    