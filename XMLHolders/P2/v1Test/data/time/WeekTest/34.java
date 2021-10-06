@Test
    public void testWeekYearConstructorWithThreadLocalCalendar() {
        BiConsumer<Integer, String> calendarSetup = (hours, locale) -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)),
                        Locale.forLanguageTag(locale))
        );
        testWeekYearConstructorWithCustomCalendar(3, "ru-RU", 4, calendarSetup);
        testWeekYearConstructorWithCustomCalendar(-6, "en-US", 3, calendarSetup);
    }

    