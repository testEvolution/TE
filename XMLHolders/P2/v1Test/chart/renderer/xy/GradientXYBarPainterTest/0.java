@Test
    public void testEquals() {
        GradientXYBarPainter p1 = new GradientXYBarPainter(0.1, 0.2, 0.3);
        GradientXYBarPainter p2 = new GradientXYBarPainter(0.1, 0.2, 0.3);
        assertEquals(p1, p2);

        p1 = new GradientXYBarPainter(0.11, 0.2, 0.3);
        assertFalse(p1.equals(p2));
        p2 = new GradientXYBarPainter(0.11, 0.2, 0.3);
        assertTrue(p1.equals(p2));

        p1 = new GradientXYBarPainter(0.11, 0.22, 0.3);
        assertFalse(p1.equals(p2));
        p2 = new GradientXYBarPainter(0.11, 0.22, 0.3);
        assertTrue(p1.equals(p2));

        p1 = new GradientXYBarPainter(0.11, 0.22, 0.33);
        assertFalse(p1.equals(p2));
        p2 = new GradientXYBarPainter(0.11, 0.22, 0.33);
        assertTrue(p1.equals(p2));
    }

    