@Test
    public void testDateConstructor1() {

        TimeZone zone = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(zone);
        Month m1 = new Month(new Date(951868799999L), zone, Locale.getDefault());
        Month m2 = new Month(new Date(951868800000L), zone, Locale.getDefault());

        assertEquals(MonthConstants.FEBRUARY, m1.getMonth());
        assertEquals(951868799999L, m1.getLastMillisecond(cal));

        assertEquals(MonthConstants.MARCH, m2.getMonth());
        assertEquals(951868800000L, m2.getFirstMillisecond(cal));

    }

    