@Test
    public void test2490803() {
        Locale savedLocale = Locale.getDefault();
        TimeZone savedTimeZone = TimeZone.getDefault();
        try {
            Locale.setDefault(Locale.FRANCE);
            TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
            GregorianCalendar c0 = new GregorianCalendar();
            c0.clear();
            /* c0.set(2009, Calendar.JANUARY, 16, 12, 34, 56);
            System.out.println(c0.getTime().getTime());
            c0.clear();
            c0.set(2009, Calendar.JANUARY, 17, 12, 34, 56);
            System.out.println(c0.getTime().getTime()); */
            PeriodAxis axis = new PeriodAxis("TestAxis");
            axis.setRange(new Range(1232105696000L, 1232192096000L), false,
                    false);
            Range r = axis.getRange();
            Day d0 = new Day(16, 1, 2009);
            Day d1 = new Day(17, 1, 2009);
            assertEquals(d0.getFirstMillisecond(), r.getLowerBound(), EPSILON);
            assertEquals(d1.getLastMillisecond() + 1.0, r.getUpperBound(),
                    EPSILON);
        }
        finally {
            TimeZone.setDefault(savedTimeZone);
            Locale.setDefault(savedLocale);
        }
    }

}