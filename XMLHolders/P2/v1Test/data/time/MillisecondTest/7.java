@Test
    public void testMillisecondSecondConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testMillisecondSecondConstructorWithCustomCalendar(3, calendarSetup);
        testMillisecondSecondConstructorWithCustomCalendar(4, calendarSetup);
    }

    