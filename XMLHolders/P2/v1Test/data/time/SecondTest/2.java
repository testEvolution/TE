@Test
    public void testDateConstructor1() {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(zone);
        Locale locale = Locale.getDefault();  // locale shouldn't matter here
        Second s1 = new Second(new Date(1016729758999L), zone, locale);
        Second s2 = new Second(new Date(1016729759000L), zone, locale);

        assertEquals(58, s1.getSecond());
        assertEquals(1016729758999L, s1.getLastMillisecond(cal));

        assertEquals(59, s2.getSecond());
        assertEquals(1016729759000L, s2.getFirstMillisecond(cal));
    }

    