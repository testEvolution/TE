@Test
    public void testGetLastMillisecondWithCalendar() {

        Day d = new Day(4, 5, 2001);
        Calendar calendar = Calendar.getInstance(
                TimeZone.getTimeZone("Europe/London"), Locale.UK);
        assertEquals(989017199999L, d.getLastMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            d.getLastMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    