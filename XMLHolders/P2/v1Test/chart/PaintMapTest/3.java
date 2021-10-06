@Test
    public void testCloning() throws CloneNotSupportedException {
        PaintMap m1 = new PaintMap();
        PaintMap m2 = (PaintMap) m1.clone();
        assertEquals(m1, m2);

        m1.put("K1", Color.RED);
        m1.put("K2", new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f, 4.0f,
                Color.YELLOW));
        m2 = (PaintMap) m1.clone();
        assertEquals(m1, m2);
    }

    