@Test
    public void testHashcode() {
        GradientXYBarPainter p1 = new GradientXYBarPainter(0.1, 0.2, 0.3);
        GradientXYBarPainter p2 = new GradientXYBarPainter(0.1, 0.2, 0.3);
        assertTrue(p1.equals(p2));
        int h1 = p1.hashCode();
        int h2 = p2.hashCode();
        assertEquals(h1, h2);
    }

    