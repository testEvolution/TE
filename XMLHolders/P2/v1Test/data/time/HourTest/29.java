@Test
    public void testGetStart() {
        Locale saved = Locale.getDefault();
        Locale.setDefault(Locale.ITALY);
        Calendar cal = Calendar.getInstance(Locale.ITALY);
        cal.set(2006, Calendar.JANUARY, 16, 3, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Hour h = new Hour(3, 16, 1, 2006);
        assertEquals(cal.getTime(), h.getStart());
        Locale.setDefault(saved);
    }

    