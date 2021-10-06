@Test
    public void testHashcode() {
        StandardXYBarPainter p1 = new StandardXYBarPainter();
        StandardXYBarPainter p2 = new StandardXYBarPainter();
        assertTrue(p1.equals(p2));
        int h1 = p1.hashCode();
        int h2 = p2.hashCode();
        assertEquals(h1, h2);
    }

    