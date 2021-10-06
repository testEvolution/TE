@Test
    public void testCloning2() throws CloneNotSupportedException {
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        r1.setDefaultPaint(Color.BLUE);
        r1.setDefaultLegendTextPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        LineAndShapeRenderer r2 = (LineAndShapeRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        MyRendererChangeListener listener = new MyRendererChangeListener();
        r2.addChangeListener(listener);
        r2.setDefaultPaint(Color.RED);
        assertTrue(listener.lastEvent.getRenderer() == r2);
        assertFalse(r1.hasListener(listener));
    }

    