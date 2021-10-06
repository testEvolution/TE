@Test
    public void testNextWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testNextWithCustomCalendar(3, calendarSetup);
        testNextWithCustomCalendar(4, calendarSetup);
    }

    