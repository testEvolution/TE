@Test
    public void testEquals() {
        DialCap c1 = new DialCap();
        DialCap c2 = new DialCap();
        assertTrue(c1.equals(c2));

        // radius
        c1.setRadius(0.5);
        assertFalse(c1.equals(c2));
        c2.setRadius(0.5);
        assertTrue(c1.equals(c2));

        // fill paint
        c1.setFillPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.GREEN));
        assertFalse(c1.equals(c2));
        c2.setFillPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.GREEN));

        // outline paint
        c1.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.gray));
        assertFalse(c1.equals(c2));
        c2.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.gray));

        assertTrue(c1.equals(c2));

        // outline stroke
        c1.setOutlineStroke(new BasicStroke(1.1f));
        assertFalse(c1.equals(c2));
        c2.setOutlineStroke(new BasicStroke(1.1f));
        assertTrue(c1.equals(c2));

        // check an inherited attribute
        c1.setVisible(false);
        assertFalse(c1.equals(c2));
        c2.setVisible(false);
        assertTrue(c1.equals(c2));
    }

    