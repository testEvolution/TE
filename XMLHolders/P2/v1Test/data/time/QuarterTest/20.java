@Test
    public void testHashcode() {
        Quarter q1 = new Quarter(2, 2003);
        Quarter q2 = new Quarter(2, 2003);
        assertTrue(q1.equals(q2));
        int h1 = q1.hashCode();
        int h2 = q2.hashCode();
        assertEquals(h1, h2);
    }

    