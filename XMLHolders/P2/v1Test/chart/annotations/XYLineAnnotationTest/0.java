@Test
    public void testEquals() {
        Stroke stroke = new BasicStroke(2.0f);
        XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0,
                stroke, Color.BLUE);
        XYLineAnnotation a2 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0,
                stroke, Color.BLUE);
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        a1 = new XYLineAnnotation(11.0, 20.0, 100.0, 200.0, stroke, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYLineAnnotation(11.0, 20.0, 100.0, 200.0, stroke, Color.BLUE);
        assertTrue(a1.equals(a2));

        a1 = new XYLineAnnotation(11.0, 21.0, 100.0, 200.0, stroke, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYLineAnnotation(11.0, 21.0, 100.0, 200.0, stroke, Color.BLUE);
        assertTrue(a1.equals(a2));

        a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke, Color.BLUE);
        assertTrue(a1.equals(a2));

        a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 201.0, stroke, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 201.0, stroke, Color.BLUE);
        assertTrue(a1.equals(a2));

        Stroke stroke2 = new BasicStroke(0.99f);
        a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, Color.BLUE);
        assertTrue(a1.equals(a2));

        GradientPaint g1 = new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE);
        GradientPaint g2 = new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE);
        a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, g1);
        assertFalse(a1.equals(a2));
        a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, g2);
        assertTrue(a1.equals(a2));
    }

    