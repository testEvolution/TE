@Test
    public void testEquals() {
        LookupPaintScale g1 = new LookupPaintScale();
        LookupPaintScale g2 = new LookupPaintScale();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new LookupPaintScale(1.0, 2.0, Color.RED);
        assertFalse(g1.equals(g2));
        g2 = new LookupPaintScale(1.0, 2.0, Color.RED);
        assertTrue(g1.equals(g2));

        g1.add(1.5, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));
        assertFalse(g1.equals(g2));
        g2.add(1.5, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));
        assertTrue(g1.equals(g2));
    }

    