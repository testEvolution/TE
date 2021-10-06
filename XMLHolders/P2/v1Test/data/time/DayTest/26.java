@Test
    public void testGetLastMillisecondWithTimeZone() {
        Day d = new Day(1, 2, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-628358400001L, d.getLastMillisecond(cal));

        // try null calendar
        boolean pass = false;
        try {
            d.getLastMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    