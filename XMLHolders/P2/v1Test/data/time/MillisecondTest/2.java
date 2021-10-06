@Test
    public void testDateConstructor1() {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(zone);
        Locale locale = Locale.getDefault();  // locale should not matter here
        Millisecond m1 = new Millisecond(new Date(1016729759122L), zone,
                locale);
        Millisecond m2 = new Millisecond(new Date(1016729759123L), zone,
                locale);

        assertEquals(122, m1.getMillisecond());
        assertEquals(1016729759122L, m1.getLastMillisecond(cal));

        assertEquals(123, m2.getMillisecond());
        assertEquals(1016729759123L, m2.getFirstMillisecond(cal));
    }

    