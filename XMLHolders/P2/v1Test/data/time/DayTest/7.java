@Test
    public void testDMYConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testDMYConstructorWithCustomCalendar(3, calendarSetup);
        testDMYConstructorWithCustomCalendar(4, calendarSetup);
    }

    