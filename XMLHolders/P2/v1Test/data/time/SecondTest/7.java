@Test
    public void testSecondMinuteConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testSecondMinuteConstructorWithCustomCalendar(3, calendarSetup);
        testSecondMinuteConstructorWithCustomCalendar(4, calendarSetup);
    }

    