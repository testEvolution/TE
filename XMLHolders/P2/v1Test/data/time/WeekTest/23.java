@Test
    public void testNextWithCalendarPrototype() {
        BiConsumer<Integer, String> calendarSetup = (hours, locale) -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)),
                        Locale.forLanguageTag(locale))
        );
        testNextWithCustomCalendar(3, "ru-RU", 4, calendarSetup);
        testNextWithCustomCalendar(-6, "en-US", 3, calendarSetup);
    }

    