@Test
    public void testMillisecondSecondConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testMillisecondSecondConstructorWithCustomCalendar(3, calendarSetup);
        testMillisecondSecondConstructorWithCustomCalendar(4, calendarSetup);
    }

    