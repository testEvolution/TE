@Test
    public void testGetEnd() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(1900, Calendar.JANUARY, 1, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        Day d = new Day(1, 1, 1900);
        assertEquals(cal.getTime(), d.getEnd());
        Locale.setDefault(saved);
    }

}