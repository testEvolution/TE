@Test
    public void testYearConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testYearConstructorWithCustomCalendar(3, calendarSetup);
        testYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    