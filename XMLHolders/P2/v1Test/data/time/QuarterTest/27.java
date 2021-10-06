@Test
    public void testGetLastMillisecondWithTimeZone() {
        Quarter q = new Quarter(2, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-615488400001L, q.getLastMillisecond(cal));

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

    