@Test
    public void testGetLastMillisecondWithTimeZone() {
        Week w = new Week(2, 1950);
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
            Calendar cal = Calendar.getInstance(zone);
            assertEquals(-629913600001L, w.getLastMillisecond(cal));
        }
        finally {
            Locale.setDefault(saved);
        }

        // try null zone
        boolean pass = false;
        try {
            w.getLastMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    