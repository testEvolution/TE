@Test
    public void testDMYConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testDMYConstructorWithCustomCalendar(3, calendarSetup);
        testDMYConstructorWithCustomCalendar(4, calendarSetup);
    }

    