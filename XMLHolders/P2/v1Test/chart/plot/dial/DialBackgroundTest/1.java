@Test
    public void testHashCode() {
        DialBackground b1 = new DialBackground(Color.RED);
        DialBackground b2 = new DialBackground(Color.RED);
        assertTrue(b1.equals(b2));
        int h1 = b1.hashCode();
        int h2 = b2.hashCode();
        assertEquals(h1, h2);
    }

    