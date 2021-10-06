@Test
    public void testHashcode() {
        Hour h1 = new Hour(7, 9, 10, 1999);
        Hour h2 = new Hour(7, 9, 10, 1999);
        assertTrue(h1.equals(h2));
        int hash1 = h1.hashCode();
        int hash2 = h2.hashCode();
        assertEquals(hash1, hash2);
    }

    