@Test
    public void testDateConstructor2() {

        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        Year y1 = new Year(new Date(1009871999999L), zone, Locale.getDefault());
        Year y2 = new Year(new Date(1009872000000L), zone, Locale.getDefault());

        assertEquals(2001, y1.getYear());
        assertEquals(1009871999999L, y1.getLastMillisecond(cal));

        assertEquals(2002, y2.getYear());
        assertEquals(1009872000000L, y2.getFirstMillisecond(cal));

    }

    