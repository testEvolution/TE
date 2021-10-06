@Test
    public void testGetFirstMillisecond() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.UK);
        TimeZone savedZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Hour h = new Hour(15, 1, 4, 2006);
        assertEquals(1143900000000L, h.getFirstMillisecond());
        Locale.setDefault(saved);
        TimeZone.setDefault(savedZone);
    }

    