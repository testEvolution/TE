@Test
    public void testDateConstructor1() {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(zone);
        Locale locale = Locale.UK;
        Day d1 = new Day(new Date(1078099199999L), zone, locale);
        Day d2 = new Day(new Date(1078099200000L), zone, locale);

        assertEquals(MonthConstants.FEBRUARY, d1.getMonth());
        assertEquals(1078099199999L, d1.getLastMillisecond(cal));

        assertEquals(MonthConstants.MARCH, d2.getMonth());
        assertEquals(1078099200000L, d2.getFirstMillisecond(cal));
    }

    