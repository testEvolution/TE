@Test
    public void testNext() {
        Day d = new Day(25, 12, 2000);
        d = (Day) d.next();
        assertEquals(2000, d.getYear());
        assertEquals(12, d.getMonth());
        assertEquals(26, d.getDayOfMonth());
        d = new Day(31, 12, 9999);
        assertNull(d.next());
    }




    