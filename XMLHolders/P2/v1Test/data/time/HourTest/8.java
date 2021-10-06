@Test
    public void testHourDayConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testHourDayConstructorWithCustomCalendar(3, calendarSetup);
        testHourDayConstructorWithCustomCalendar(4, calendarSetup);
    }

    