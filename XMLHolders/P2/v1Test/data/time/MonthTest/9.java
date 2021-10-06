@Test
    public void testMonthIntYearConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testMonthIntYearConstructorWithCustomCalendar(3, calendarSetup);
        testMonthIntYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    