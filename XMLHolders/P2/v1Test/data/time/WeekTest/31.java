@Test
    public void testWeekIntYearConstructorWithThreadLocalCalendar() {
        BiConsumer<Integer, String> calendarSetup = (hours, locale) -> RegularTimePeriod.setCalendarInstancePrototype(
                Calendar.getInstance(TimeZone.getTimeZone(ZoneOffset.ofHours(hours)),
                        Locale.forLanguageTag(locale))
        );
        testWeekIntYearConstructorWithCustomCalendar(3, "ru-RU", 4, calendarSetup);
        testWeekIntYearConstructorWithCustomCalendar(-6, "en-US", 3, calendarSetup);
    }

    