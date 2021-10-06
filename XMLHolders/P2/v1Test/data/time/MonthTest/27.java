@Test
    public void testGetLastMillisecondWithCalendar() {
        Month m = new Month(3, 2001);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(986083199999L, m.getLastMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            m.getLastMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    