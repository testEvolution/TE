@Test
    public void testGetEnd() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.JANUARY, 8, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        Week w = new Week(1, 2006);
        assertEquals(cal.getTime(), w.getEnd());
        Locale.setDefault(saved);
    }

    