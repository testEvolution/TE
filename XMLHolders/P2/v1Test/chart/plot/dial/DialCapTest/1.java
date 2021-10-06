@Test
    public void testHashCode() {
        DialCap c1 = new DialCap();
        DialCap c2 = new DialCap();
        assertTrue(c1.equals(c2));
        int h1 = c1.hashCode();
        int h2 = c2.hashCode();
        assertEquals(h1, h2);
    }

    