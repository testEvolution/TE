@Test
    public void testSerialDateConstructorWithThreadLocalCalendar() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setThreadLocalCalendarInstance(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testSerialDateConstructorWithCustomCalendar(3, calendarSetup);
        testSerialDateConstructorWithCustomCalendar(4, calendarSetup);
    }

    