@Test
    public void testDateConstructor2() {
        TimeZone zone = TimeZone.getTimeZone("Europe/Helsinki");
        Calendar cal = Calendar.getInstance(zone);
        Locale locale = Locale.getDefault();  // locale shouldn't matter here
        Day d1 = new Day(new Date(1078091999999L), zone, locale);
        Day d2 = new Day(new Date(1078092000000L), zone, locale);

        assertEquals(MonthConstants.FEBRUARY, d1.getMonth());
        assertEquals(1078091999999L, d1.getLastMillisecond(cal));

        assertEquals(MonthConstants.MARCH, d2.getMonth());
        assertEquals(1078092000000L, d2.getFirstMillisecond(cal));
    }

    