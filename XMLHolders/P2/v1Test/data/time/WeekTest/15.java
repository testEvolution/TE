@Test
    public void testGetFirstMillisecondWithTimeZone() {
        Week w = new Week(47, 1950);
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
            Calendar cal = Calendar.getInstance(zone);
            assertEquals(-603302400000L, w.getFirstMillisecond(cal));
        }
        finally {
            Locale.setDefault(saved);
        }

        // try null calendar
        boolean pass = false;
        try {
            w.getFirstMillisecond((Calendar) null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    