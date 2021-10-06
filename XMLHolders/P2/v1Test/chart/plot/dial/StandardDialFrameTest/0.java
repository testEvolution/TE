@Test
    public void testEquals() {
        StandardDialFrame f1 = new StandardDialFrame();
        StandardDialFrame f2 = new StandardDialFrame();
        assertTrue(f1.equals(f2));

        // radius
        f1.setRadius(0.2);
        assertFalse(f1.equals(f2));
        f2.setRadius(0.2);
        assertTrue(f1.equals(f2));

        // backgroundPaint
        f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.WHITE, 3.0f,
                4.0f, Color.YELLOW));
        assertFalse(f1.equals(f2));
        f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.WHITE, 3.0f,
                4.0f, Color.YELLOW));
        assertTrue(f1.equals(f2));

        // foregroundPaint
        f1.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE, 3.0f,
                4.0f, Color.GREEN));
        assertFalse(f1.equals(f2));
        f2.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE, 3.0f,
                4.0f, Color.GREEN));
        assertTrue(f1.equals(f2));

        // stroke
        f1.setStroke(new BasicStroke(2.4f));
        assertFalse(f1.equals(f2));
        f2.setStroke(new BasicStroke(2.4f));
        assertTrue(f1.equals(f2));

        // check an inherited attribute
        f1.setVisible(false);
        assertFalse(f1.equals(f2));
        f2.setVisible(false);
        assertTrue(f1.equals(f2));
    }

    