@Test
    public void testEquals() {
        XYBoxAnnotation a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0,
                new BasicStroke(1.2f), Color.RED, Color.BLUE);
        XYBoxAnnotation a2 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0,
                new BasicStroke(1.2f), Color.RED, Color.BLUE);
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        // x0
        a1 = new XYBoxAnnotation(2.0, 2.0, 3.0, 4.0, new BasicStroke(1.2f),
                Color.RED, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYBoxAnnotation(2.0, 2.0, 3.0, 4.0, new BasicStroke(1.2f),
                Color.RED, Color.BLUE);
        assertTrue(a1.equals(a2));

        // stroke
        a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(2.3f),
                Color.RED, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(2.3f),
                Color.RED, Color.BLUE);
        assertTrue(a1.equals(a2));

        GradientPaint gp1a = new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.RED);
        GradientPaint gp1b = new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.RED);
        GradientPaint gp2a = new GradientPaint(5.0f, 6.0f, Color.pink,
                7.0f, 8.0f, Color.WHITE);
        GradientPaint gp2b = new GradientPaint(5.0f, 6.0f, Color.pink,
                7.0f, 8.0f, Color.WHITE);

        // outlinePaint
        a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(2.3f),
                gp1a, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(2.3f),
                gp1b, Color.BLUE);
        assertTrue(a1.equals(a2));

        // fillPaint
        a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(2.3f),
                gp1a, gp2a);
        assertFalse(a1.equals(a2));
        a2 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(2.3f),
                gp1b, gp2b);
        assertTrue(a1.equals(a2));
    }

    