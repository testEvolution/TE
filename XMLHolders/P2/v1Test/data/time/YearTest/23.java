@Test
    public void testGetLastMillisecondWithCalendar() {
        Year y = new Year(2001);
        GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY);
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt"));
        assertEquals(1009843199999L, y.getLastMillisecond(calendar));

        // try null calendar
        boolean pass = false;
        try {
            y.getLastMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    