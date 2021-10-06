@Test
    public void testEqualsWithLocale() {
        PeriodAxis a1 = new PeriodAxis("Test", new Year(2000), new Year(2009),
                TimeZone.getDefault(), Locale.JAPAN);
        PeriodAxis a2 = new PeriodAxis("Test", new Year(2000), new Year(2009),
                TimeZone.getDefault(), Locale.JAPAN);
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        a1 = new PeriodAxis("Test", new Year(2000), new Year(2009),
                TimeZone.getDefault(), Locale.UK);
        assertFalse(a1.equals(a2));
        a2 = new PeriodAxis("Test", new Year(2000), new Year(2009),
                TimeZone.getDefault(), Locale.UK);
        assertTrue(a1.equals(a2));
    }

    