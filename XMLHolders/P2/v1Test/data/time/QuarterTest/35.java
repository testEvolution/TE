@Test
    public void testGetEnd() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.MARCH, 31, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        Quarter q = new Quarter(1, 2006);
        assertEquals(cal.getTime(), q.getEnd());
        Locale.setDefault(saved);
    }
}