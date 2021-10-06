@Test
    public void testDateConstructor2() {

        TimeZone zone = TimeZone.getTimeZone("Europe/Istanbul");
        Calendar cal = Calendar.getInstance(zone);
        Quarter q1 = new Quarter(new Date(1017608399999L), zone, Locale.getDefault());
        Quarter q2 = new Quarter(new Date(1017608400000L), zone, Locale.getDefault());

        assertEquals(1, q1.getQuarter());
        assertEquals(1017608399999L, q1.getLastMillisecond(cal));

        assertEquals(2, q2.getQuarter());
        assertEquals(1017608400000L, q2.getFirstMillisecond(cal));

    }

    