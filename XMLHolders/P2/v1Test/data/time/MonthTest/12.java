@Test
    public void testMonthYearConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testMonthYearConstructorWithCustomCalendar(3, calendarSetup);
        testMonthYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    