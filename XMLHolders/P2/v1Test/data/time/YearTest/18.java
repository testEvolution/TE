@Test
    public void testGetFirstMillisecond() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.UK);
        TimeZone savedZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Year y = new Year(1970);
        // TODO: Check this result...
        assertEquals(-3600000L, y.getFirstMillisecond());
        Locale.setDefault(saved);
        TimeZone.setDefault(savedZone);
    }

    