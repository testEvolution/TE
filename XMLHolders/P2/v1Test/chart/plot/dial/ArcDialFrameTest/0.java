@Test
    public void testEquals() {
        ArcDialFrame f1 = new ArcDialFrame();
        ArcDialFrame f2 = new ArcDialFrame();
        assertTrue(f1.equals(f2));

        // background paint
        f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(f1.equals(f2));
        f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(f1.equals(f2));

        // foreground paint
        f1.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(f1.equals(f2));
        f2.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(f1.equals(f2));

        // stroke
        f1.setStroke(new BasicStroke(1.1f));
        assertFalse(f1.equals(f2));
        f2.setStroke(new BasicStroke(1.1f));
        assertTrue(f1.equals(f2));

        // inner radius
        f1.setInnerRadius(0.11);
        assertFalse(f1.equals(f2));
        f2.setInnerRadius(0.11);
        assertTrue(f1.equals(f2));

        // outer radius
        f1.setOuterRadius(0.88);
        assertFalse(f1.equals(f2));
        f2.setOuterRadius(0.88);
        assertTrue(f1.equals(f2));

        // startAngle
        f1.setStartAngle(99);
        assertFalse(f1.equals(f2));
        f2.setStartAngle(99);
        assertTrue(f1.equals(f2));

        // extent
        f1.setExtent(33);
        assertFalse(f1.equals(f2));
        f2.setExtent(33);
        assertTrue(f1.equals(f2));

        // check an inherited attribute
        f1.setVisible(false);
        assertFalse(f1.equals(f2));
        f2.setVisible(false);
        assertTrue(f1.equals(f2));
    }

    