@Test
    public void testHourDayConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testHourDayConstructorWithCustomCalendar(3, calendarSetup);
        testHourDayConstructorWithCustomCalendar(4, calendarSetup);
    }

    