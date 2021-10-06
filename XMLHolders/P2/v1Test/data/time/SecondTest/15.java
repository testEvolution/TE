@Test
    public void testGetFirstMillisecondWithCalendar() {
        Second s = new Second(55, 40, 2, 15, 4, 2000);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(955766455000L, s.getFirstMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            s.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    