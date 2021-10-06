@Test
    public void testDateConstructor1() {

        TimeZone zone = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(zone);
        Date d1 = new Date(1009843199999L);
        Date d2 = new Date(1009843200000L);
        Year y1 = new Year(d1, zone, Locale.getDefault());
        Year y2 = new Year(d2, zone, Locale.getDefault());

        assertEquals(2001, y1.getYear());
        assertEquals(1009843199999L, y1.getLastMillisecond(cal));

        assertEquals(2002, y2.getYear());
        assertEquals(1009843200000L, y2.getFirstMillisecond(cal));

    }

    