@Test
    public void testCloning() throws CloneNotSupportedException {
        Crosshair c1 = new Crosshair(1.0, new GradientPaint(1.0f, 2.0f,
                Color.RED, 3.0f, 4.0f, Color.BLUE), new BasicStroke(1.0f));
        Crosshair c2 = (Crosshair) c1.clone();
        assertTrue(c1 != c2);
        assertTrue(c1.getClass() == c2.getClass());
        assertTrue(c1.equals(c2));
    }

    