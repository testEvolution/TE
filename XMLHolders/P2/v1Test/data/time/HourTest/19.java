@Test
    public void testGetFirstMillisecondWithTimeZone() {
        Hour h = new Hour(15, 1, 4, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-623293200000L, h.getFirstMillisecond(cal));

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

    