@Test
    public void testHashCode() {
        StandardDialScale s1 = new StandardDialScale();
        StandardDialScale s2 = new StandardDialScale();
        assertTrue(s1.equals(s2));
        int h1 = s1.hashCode();
        int h2 = s2.hashCode();
        assertEquals(h1, h2);
    }

    