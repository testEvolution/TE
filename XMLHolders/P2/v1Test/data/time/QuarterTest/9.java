@Test
    public void testQuarterIntYearConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testQuarterIntYearConstructorWithCustomCalendar(3, calendarSetup);
        testQuarterIntYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    