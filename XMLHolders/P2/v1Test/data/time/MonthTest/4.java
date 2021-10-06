@Test
    public void testDateConstructor2() {

        TimeZone zone = TimeZone.getTimeZone("Pacific/Auckland");
        Calendar cal = Calendar.getInstance(zone);
        Month m1 = new Month(new Date(951821999999L), zone, Locale.getDefault());
        Month m2 = new Month(new Date(951822000000L), zone, Locale.getDefault());

        assertEquals(MonthConstants.FEBRUARY, m1.getMonth());
        assertEquals(951821999999L, m1.getLastMillisecond(cal));

        assertEquals(MonthConstants.MARCH, m2.getMonth());
        assertEquals(951822000000L, m2.getFirstMillisecond(cal));

    }

    