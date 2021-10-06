@Test
    public void testGetFirstMillisecondWithCalendar() {
        Year y = new Year(2001);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(978307200000L, y.getFirstMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            y.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    