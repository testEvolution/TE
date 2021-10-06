@Test
    public void testMonthYearConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testMonthYearConstructorWithCustomCalendar(3, calendarSetup);
        testMonthYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    