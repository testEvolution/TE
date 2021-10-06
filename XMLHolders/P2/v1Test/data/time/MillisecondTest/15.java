@Test
    public void testGetFirstMillisecondWithTimeZone() {
        Millisecond m = new Millisecond(500, 50, 59, 15, 1, 4, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-623289609500L, m.getFirstMillisecond(cal));

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

    