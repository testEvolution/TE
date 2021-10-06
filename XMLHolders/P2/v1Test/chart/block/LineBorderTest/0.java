@Test
    public void testEquals() {
        LineBorder b1 = new LineBorder(Color.RED, new BasicStroke(1.0f),
                new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        LineBorder b2 = new LineBorder(Color.RED, new BasicStroke(1.0f),
                new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        assertTrue(b1.equals(b2));
        assertTrue(b2.equals(b2));

        b1 = new LineBorder(Color.BLUE, new BasicStroke(1.0f),
                new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        assertFalse(b1.equals(b2));
        b2 = new LineBorder(Color.BLUE, new BasicStroke(1.0f),
                new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        assertTrue(b1.equals(b2));

        b1 = new LineBorder(Color.BLUE, new BasicStroke(1.1f),
                new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        assertFalse(b1.equals(b2));
        b2 = new LineBorder(Color.BLUE, new BasicStroke(1.1f),
                new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        assertTrue(b1.equals(b2));

        b1 = new LineBorder(Color.BLUE, new BasicStroke(1.1f),
                new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertFalse(b1.equals(b2));
        b2 = new LineBorder(Color.BLUE, new BasicStroke(1.1f),
                new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertTrue(b1.equals(b2));

    }

    