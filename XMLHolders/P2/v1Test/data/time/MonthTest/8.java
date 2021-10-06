@Test
    public void testMonthIntYearConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testMonthIntYearConstructorWithCustomCalendar(3, calendarSetup);
        testMonthIntYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    