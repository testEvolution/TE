@Test
    public void testBug1448828() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.UK);
        try {
            Week w = new Week(new Date(1136109830000l),
                    TimeZone.getTimeZone("GMT"), Locale.UK);
            assertEquals(2005, w.getYearValue());
            assertEquals(52, w.getWeek());
        }
        finally {
            Locale.setDefault(saved);
        }
    }

    