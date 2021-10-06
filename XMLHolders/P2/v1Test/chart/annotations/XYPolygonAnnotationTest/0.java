@Test
    public void testEquals() {
        Stroke stroke1 = new BasicStroke(2.0f);
        Stroke stroke2 = new BasicStroke(2.5f);
        XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] {1.0,
                2.0, 3.0, 4.0, 5.0, 6.0}, stroke1, Color.RED, Color.BLUE);
        XYPolygonAnnotation a2 = new XYPolygonAnnotation(new double[] {1.0,
                2.0, 3.0, 4.0, 5.0, 6.0}, stroke1, Color.RED, Color.BLUE);
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke1, Color.RED, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke1, Color.RED, Color.BLUE);
        assertTrue(a1.equals(a2));

        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, Color.RED, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, Color.RED, Color.BLUE);
        assertTrue(a1.equals(a2));

        GradientPaint gp1 = new GradientPaint(1.0f, 2.0f, Color.YELLOW, 3.0f,
                4.0f, Color.WHITE);
        GradientPaint gp2 = new GradientPaint(1.0f, 2.0f, Color.YELLOW, 3.0f,
                4.0f, Color.WHITE);
        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp1, Color.BLUE);
        assertFalse(a1.equals(a2));
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp2, Color.BLUE);
        assertTrue(a1.equals(a2));

        GradientPaint gp3 = new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f,
                4.0f, Color.WHITE);
        GradientPaint gp4 = new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f,
                4.0f, Color.WHITE);
        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp1, gp3);
        assertFalse(a1.equals(a2));
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp2, gp4);
        assertTrue(a1.equals(a2));
    }

    