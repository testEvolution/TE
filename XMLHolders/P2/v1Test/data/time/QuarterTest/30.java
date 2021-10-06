@Test
    public void testNext() {
        Quarter q = new Quarter(1, 2000);
        q = (Quarter) q.next();
        assertEquals(new Year(2000), q.getYear());
        assertEquals(2, q.getQuarter());
        q = new Quarter(4, 9999);
        assertNull(q.next());
    }

    