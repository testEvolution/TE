@Test
    public void testGetLastMillisecond() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.UK);
        TimeZone savedZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Year y = new Year(1970);
        // TODO: Check this result...
        assertEquals(31532399999L, y.getLastMillisecond());
        Locale.setDefault(saved);
        TimeZone.setDefault(savedZone);
    }

    