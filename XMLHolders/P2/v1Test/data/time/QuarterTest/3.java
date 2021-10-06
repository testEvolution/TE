@Test
    public void testDateConstructor1() {

        TimeZone zone = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(zone);
        Quarter q1 = new Quarter(new Date(1017619199999L), zone, Locale.getDefault());
        Quarter q2 = new Quarter(new Date(1017619200000L), zone, Locale.getDefault());

        assertEquals(1, q1.getQuarter());
        assertEquals(1017619199999L, q1.getLastMillisecond(cal));

        assertEquals(2, q2.getQuarter());
        assertEquals(1017619200000L, q2.getFirstMillisecond(cal));

    }

    