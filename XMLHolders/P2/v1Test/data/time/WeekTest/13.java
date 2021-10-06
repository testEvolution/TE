@Test
    public void testBug1498805() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.UK);
        try {
            TimeZone zone = TimeZone.getTimeZone("GMT");
            GregorianCalendar gc = new GregorianCalendar(zone);
            gc.set(2005, Calendar.JANUARY, 1, 12, 0, 0);
            Week w = new Week(gc.getTime(), zone, Locale.UK);
            assertEquals(53, w.getWeek());
            assertEquals(new Year(2004), w.getYear());
        }
        finally {
            Locale.setDefault(saved);
        }
    }

    