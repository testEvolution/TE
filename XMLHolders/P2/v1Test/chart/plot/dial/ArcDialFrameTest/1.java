@Test
    public void testHashCode() {
        ArcDialFrame f1 = new ArcDialFrame();
        ArcDialFrame f2 = new ArcDialFrame();
        assertTrue(f1.equals(f2));
        int h1 = f1.hashCode();
        int h2 = f2.hashCode();
        assertEquals(h1, h2);
    }

    