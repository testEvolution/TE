@Test
    public void testEquals() {
        CategoryMarker m1 = new CategoryMarker("A");
        CategoryMarker m2 = new CategoryMarker("A");
        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1));

        //key
        m1 = new CategoryMarker("B");
        assertFalse(m1.equals(m2));
        m2 = new CategoryMarker("B");
        assertTrue(m1.equals(m2));

        //paint
        m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(1.1f));
        assertFalse(m1.equals(m2));
        m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(1.1f));
        assertTrue(m1.equals(m2));

        //stroke
        m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f));
        assertFalse(m1.equals(m2));
        m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f));
        assertTrue(m1.equals(m2));

        //outlinePaint
        m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f), Color.RED,
                new BasicStroke(1.0f), 1.0f);
        assertFalse(m1.equals(m2));
        m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f), Color.RED,
                new BasicStroke(1.0f), 1.0f);
        assertTrue(m1.equals(m2));

        //outlineStroke
        m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f), Color.RED,
                new BasicStroke(3.3f), 1.0f);
        assertFalse(m1.equals(m2));
        m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f), Color.RED,
                new BasicStroke(3.3f), 1.0f);
        assertTrue(m1.equals(m2));

        //alpha
        m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f), Color.RED,
                new BasicStroke(1.0f), 0.5f);
        assertFalse(m1.equals(m2));
        m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW), new BasicStroke(2.2f), Color.RED,
                new BasicStroke(1.0f), 0.5f);
        assertTrue(m1.equals(m2));

    }

    