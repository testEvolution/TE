@Test
    public void testGetFirstMillisecondWithCalendar() {
        Quarter q = new Quarter(1, 2001);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(978307200000L, q.getFirstMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            q.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    