@Test
    public void testQuarterYearConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testQuarterYearConstructorWithCustomCalendar(3, calendarSetup);
        testQuarterYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    