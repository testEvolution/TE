@Test
    public void testGetFirstMillisecondWithTimeZone() {
        Quarter q = new Quarter(2, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-623347200000L, q.getFirstMillisecond(cal));

        // try null calendar
        boolean pass = false;
        try {
            q.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    