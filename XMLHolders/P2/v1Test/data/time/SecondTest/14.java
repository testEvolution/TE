@Test
    public void testGetFirstMillisecondWithTimeZone() {
        Second s = new Second(50, 59, 15, 1, 4, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-623289610000L, s.getFirstMillisecond(cal));

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

    