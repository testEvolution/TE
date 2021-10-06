@Test
    public void testGetFirstMillisecondWithCalendar() {
        Hour h = new Hour(2, 15, 4, 2000);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(955764000000L, h.getFirstMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            h.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    