@Test
    public void testWeek532005() {
        Week w1 = new Week(53, 2004);
        Calendar c1 = Calendar.getInstance(
                TimeZone.getTimeZone("Europe/London"), Locale.UK);
        c1.setMinimalDaysInFirstWeek(4);  // see Java Bug ID 4960215
        assertEquals(1104105600000L, w1.getFirstMillisecond(c1));
        assertEquals(1104710399999L, w1.getLastMillisecond(c1));
        Calendar c2 = Calendar.getInstance(
                TimeZone.getTimeZone("Europe/Paris"), Locale.FRANCE);
        c2.setMinimalDaysInFirstWeek(4);  // see Java Bug ID 4960215
        assertEquals(1104102000000L, w1.getFirstMillisecond(c2));
        assertEquals(1104706799999L, w1.getLastMillisecond(c2));
        w1 = new Week(53, 2005);
        Calendar c3 = Calendar.getInstance(
                TimeZone.getTimeZone("America/New_York"), Locale.US);
        assertEquals(1135486800000L, w1.getFirstMillisecond(c3));
        assertEquals(1136091599999L, w1.getLastMillisecond(c3));
    }

    