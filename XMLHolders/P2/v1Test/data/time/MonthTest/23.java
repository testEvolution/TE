@Test
    public void testGetFirstMillisecondWithTimeZone() {
        Month m = new Month(2, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-628444800000L, m.getFirstMillisecond(cal));

        // try null calendar
        boolean pass = false;
        try {
            m.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    