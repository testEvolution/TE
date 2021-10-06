@Test
    public void testGetEnd() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.JANUARY, 16, 3, 47, 55);
        cal.set(Calendar.MILLISECOND, 999);
        Second s = new Second(55, 47, 3, 16, 1, 2006);
        assertEquals(cal.getTime(), s.getEnd());
        Locale.setDefault(saved);
    }

}