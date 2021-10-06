@Test
    public void testNext() {
        Month m = new Month(12, 2000);
        m = (Month) m.next();
        assertEquals(new Year(2001), m.getYear());
        assertEquals(1, m.getMonth());
        m = new Month(12, 9999);
        assertNull(m.next());
    }

    