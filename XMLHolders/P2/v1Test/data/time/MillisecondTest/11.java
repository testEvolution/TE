@Test
    public void testHashcode() {
        Millisecond m1 = new Millisecond(599, 23, 45, 7, 9, 10, 2007);
        Millisecond m2 = new Millisecond(599, 23, 45, 7, 9, 10, 2007);
        assertTrue(m1.equals(m2));
        int hash1 = m1.hashCode();
        int hash2 = m2.hashCode();
        assertEquals(hash1, hash2);
    }

    