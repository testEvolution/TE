@Test
    public void testGetStart() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.JANUARY, 16, 3, 47, 55);
        cal.set(Calendar.MILLISECOND, 555);
        Millisecond m = new Millisecond(555, 55, 47, 3, 16, 1, 2006);
        assertEquals(cal.getTime(), m.getStart());
        Locale.setDefault(saved);
    }

    