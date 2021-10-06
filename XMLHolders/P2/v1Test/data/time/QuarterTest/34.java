@Test
    public void testGetStart() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.JULY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Quarter q = new Quarter(3, 2006);
        assertEquals(cal.getTime(), q.getStart());
        Locale.setDefault(saved);
    }

    