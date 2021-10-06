@Test
    public void testWeek12005() {
        Week w1 = new Week(1, 2005);
        Calendar c1 = Calendar.getInstance(
                TimeZone.getTimeZone("Europe/London"), Locale.UK);
        c1.setMinimalDaysInFirstWeek(4);  // see Java Bug ID 4960215
        assertEquals(1104710400000L, w1.getFirstMillisecond(c1));
        assertEquals(1105315199999L, w1.getLastMillisecond(c1));
        Calendar c2 = Calendar.getInstance(
                TimeZone.getTimeZone("Europe/Paris"), Locale.FRANCE);
        c2.setMinimalDaysInFirstWeek(4);  // see Java Bug ID 4960215
        assertEquals(1104706800000L, w1.getFirstMillisecond(c2));
        assertEquals(1105311599999L, w1.getLastMillisecond(c2));
        Calendar c3 = Calendar.getInstance(
                TimeZone.getTimeZone("America/New_York"), Locale.US);
        assertEquals(1104037200000L, w1.getFirstMillisecond(c3));
        assertEquals(1104641999999L, w1.getLastMillisecond(c3));
    }

    