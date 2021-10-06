@Test
    public void testNext() {
        Year y = new Year(2000);
        y = (Year) y.next();
        assertEquals(2001, y.getYear());
        y = new Year(9999);
        assertNull(y.next());
    }

    