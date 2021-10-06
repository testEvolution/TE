@Test
    public void testHashcode() {
        DateTitle t1 = new DateTitle();
        DateTitle t2 = new DateTitle();
        assertTrue(t1.equals(t2));
        int h1 = t1.hashCode();
        int h2 = t2.hashCode();
        assertEquals(h1, h2);
    }

    