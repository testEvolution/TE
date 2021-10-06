@Test
    public void testQuarterIntYearConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testQuarterIntYearConstructorWithCustomCalendar(3, calendarSetup);
        testQuarterIntYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    