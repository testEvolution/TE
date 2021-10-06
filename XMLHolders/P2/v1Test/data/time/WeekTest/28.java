@Test
    public void testDateConstructorWithThreadLocalCalendar() {
        BiConsumer<Integer, String> calendarSetup = (hours, locale) -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)),
                        Locale.forLanguageTag(locale))
        );
        testDateConstructorWithCustomCalendar(3, "ru-RU", 4, calendarSetup);
        testDateConstructorWithCustomCalendar(-6, "en-US", 3, calendarSetup);
    }

    