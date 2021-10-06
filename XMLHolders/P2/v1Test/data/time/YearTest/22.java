@Test
    public void testGetLastMillisecondWithTimeZone() {
        Year y = new Year(1950);
        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal = Calendar.getInstance(zone);
        assertEquals(-599587200001L, y.getLastMillisecond(cal));

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

    