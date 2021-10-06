@Test
    public void testCloning() throws CloneNotSupportedException {
        XYErrorRenderer r1 = new XYErrorRenderer();
        r1.setErrorPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.WHITE));
        XYErrorRenderer r2 = (XYErrorRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    