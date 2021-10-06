@Test
    public void testSerialDateConstructorWithCalendarPrototype() {
        Consumer<Integer> calendarSetup = hours -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)))
        );
        testSerialDateConstructorWithCustomCalendar(3, calendarSetup);
        testSerialDateConstructorWithCustomCalendar(4, calendarSetup);
    }

    