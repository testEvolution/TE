@Test
    public void testGetFirstMillisecondWithCalendar() {
        Day d = new Day(1, 12, 2001);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(1007164800000L, d.getFirstMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            d.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    