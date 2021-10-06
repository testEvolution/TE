@Test
    public void testGetLastMillisecondWithCalendar() {
        Quarter q = new Quarter(3, 2001);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(1001894399999L, q.getLastMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            q.getLastMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    