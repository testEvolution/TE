@Test
    public void testYearConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testYearConstructorWithCustomCalendar(3, calendarSetup);
        testYearConstructorWithCustomCalendar(4, calendarSetup);
    }

    