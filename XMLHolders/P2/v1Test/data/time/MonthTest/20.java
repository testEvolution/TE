@Test
    public void testHashcode() {
        Month m1 = new Month(2, 2003);
        Month m2 = new Month(2, 2003);
        assertTrue(m1.equals(m2));
        int h1 = m1.hashCode();
        int h2 = m2.hashCode();
        assertEquals(h1, h2);
    }

    