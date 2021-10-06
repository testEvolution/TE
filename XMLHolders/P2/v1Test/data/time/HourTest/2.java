@Test
    public void testDateConstructor1() {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(zone);
        Locale locale = Locale.getDefault();  // locale should not matter here
        Hour h1 = new Hour(new Date(1014307199999L), zone, locale);
        Hour h2 = new Hour(new Date(1014307200000L), zone, locale);

        assertEquals(15, h1.getHour());
        assertEquals(1014307199999L, h1.getLastMillisecond(cal));

        assertEquals(16, h2.getHour());
        assertEquals(1014307200000L, h2.getFirstMillisecond(cal));
    }

    