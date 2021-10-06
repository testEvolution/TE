@Test
    public void testGetFirstMillisecondWithCalendar() {
        Week w = new Week(1, 2001);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(978307200000L, w.getFirstMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            w.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    