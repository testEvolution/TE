@Test
    public void testEquals() {
        XYDifferenceRenderer r1 = new XYDifferenceRenderer(
                Color.RED, Color.BLUE, false);
        XYDifferenceRenderer r2 = new XYDifferenceRenderer(
                Color.RED, Color.BLUE, false);
        assertEquals(r1, r2);

        // positive paint
        r1.setPositivePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(r1.equals(r2));
        r2.setPositivePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(r1.equals(r2));

        // negative paint
        r1.setNegativePaint(new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(r1.equals(r2));
        r2.setNegativePaint(new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(r1.equals(r2));

        // shapesVisible
        r1 = new XYDifferenceRenderer(Color.GREEN, Color.YELLOW, true);
        assertFalse(r1.equals(r2));
        r2 = new XYDifferenceRenderer(Color.GREEN, Color.YELLOW, true);
        assertTrue(r1.equals(r2));

        // legendLine
        r1.setLegendLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0));
        assertFalse(r1.equals(r2));
        r2.setLegendLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0));
        assertTrue(r1.equals(r2));

        // roundXCoordinates
        r1.setRoundXCoordinates(true);
        assertFalse(r1.equals(r2));
        r2.setRoundXCoordinates(true);
        assertTrue(r1.equals(r2));

        assertFalse(r1.equals(null));
    }

    