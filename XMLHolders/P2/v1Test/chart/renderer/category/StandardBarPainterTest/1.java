@Test
    public void testHashcode() {
        StandardBarPainter p1 = new StandardBarPainter();
        StandardBarPainter p2 = new StandardBarPainter();
        assertTrue(p1.equals(p2));
        int h1 = p1.hashCode();
        int h2 = p2.hashCode();
        assertEquals(h1, h2);
    }

    