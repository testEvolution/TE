@Test
    public void testQuarterYearConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testQuarterYearConstructorWithCustomCalendar(3, calendarSetup);
        testQuarterYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    