@Test
    public void testDateConstructor2() {
        TimeZone zone = TimeZone.getTimeZone("Europe/Tallinn");
        Calendar cal = Calendar.getInstance(zone);
        Locale locale = Locale.getDefault();  // locale should not matter here
        Millisecond m1 = new Millisecond(new Date(1016722559122L), zone,
                locale);
        Millisecond m2 = new Millisecond(new Date(1016722559123L), zone,
                locale);

        assertEquals(122, m1.getMillisecond());
        assertEquals(1016722559122L, m1.getLastMillisecond(cal));

        assertEquals(123, m2.getMillisecond());
        assertEquals(1016722559123L, m2.getFirstMillisecond(cal));
    }

    