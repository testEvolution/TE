@Test
    public void testEquals() {
        StandardDialRange r1 = new StandardDialRange();
        StandardDialRange r2 = new StandardDialRange();
        assertTrue(r1.equals(r2));

        // lowerBound
        r1.setLowerBound(1.1);
        assertFalse(r1.equals(r2));
        r2.setLowerBound(1.1);
        assertTrue(r1.equals(r2));

        // upperBound
        r1.setUpperBound(11.1);
        assertFalse(r1.equals(r2));
        r2.setUpperBound(11.1);
        assertTrue(r1.equals(r2));

        // paint
        r1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));
        assertFalse(r1.equals(r2));
        r2.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));
        assertTrue(r1.equals(r2));

        // check an inherited attribute
        r1.setVisible(false);
        assertFalse(r1.equals(r2));
        r2.setVisible(false);
        assertTrue(r1.equals(r2));
    }

    