@Test
    public void testCloning() throws CloneNotSupportedException {
        LookupPaintScale g1 = new LookupPaintScale();
        LookupPaintScale g2 = (LookupPaintScale) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        g1.add(0.5, Color.RED);
        assertFalse(g1.equals(g2));
        g2.add(0.5, Color.RED);
        assertTrue(g1.equals(g2));

        // try with gradient paint
        g1 = new LookupPaintScale(1.0, 2.0, new GradientPaint(1.0f, 2.0f,
                Color.RED, 3.0f, 4.0f, Color.GREEN));
        g1.add(1.5, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));
        g2 = (LookupPaintScale) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    