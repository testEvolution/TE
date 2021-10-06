@Test
    public void testGetLastMillisecondWithTimeZone() {
        Hour h = new Hour(2, 7, 7, 1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-614959200001L, h.getLastMillisecond(cal));

        // try null calendar
        boolean pass = false;
        try {
            h.getLastMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    