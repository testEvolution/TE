@Test
    public void testGetEnd() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.JANUARY, 8, 1, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        Hour h = new Hour(1, 8, 1, 2006);
        assertEquals(cal.getTime(), h.getEnd());
        Locale.setDefault(saved);
    }

}