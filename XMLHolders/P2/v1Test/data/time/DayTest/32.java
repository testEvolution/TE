@Test
    public void testGetStart() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.NOVEMBER, 3, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Day d = new Day(3, 11, 2006);
        assertEquals(cal.getTime(), d.getStart());
        Locale.setDefault(saved);
    }

    