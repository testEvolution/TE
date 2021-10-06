@Test
    public void testHashCode() {
        StandardDialFrame f1 = new StandardDialFrame();
        StandardDialFrame f2 = new StandardDialFrame();
        assertTrue(f1.equals(f2));
        int h1 = f1.hashCode();
        int h2 = f2.hashCode();
        assertEquals(h1, h2);
    }

    