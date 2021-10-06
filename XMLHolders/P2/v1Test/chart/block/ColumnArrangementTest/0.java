@Test
    public void testEquals() {
        ColumnArrangement c1 = new ColumnArrangement(HorizontalAlignment.LEFT,
                VerticalAlignment.TOP, 1.0, 2.0);
        ColumnArrangement c2 = new ColumnArrangement(HorizontalAlignment.LEFT,
                VerticalAlignment.TOP, 1.0, 2.0);
        assertTrue(c1.equals(c2));
        assertTrue(c2.equals(c1));

        c1 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.TOP, 1.0, 2.0);
        assertFalse(c1.equals(c2));
        c2 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.TOP, 1.0, 2.0);
        assertTrue(c1.equals(c2));

        c1 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.0, 2.0);
        assertFalse(c1.equals(c2));
        c2 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.0, 2.0);
        assertTrue(c1.equals(c2));

        c1 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.0);
        assertFalse(c1.equals(c2));
        c2 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.0);
        assertTrue(c1.equals(c2));

        c1 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.2);
        assertFalse(c1.equals(c2));
        c2 = new ColumnArrangement(HorizontalAlignment.RIGHT,
                VerticalAlignment.BOTTOM, 1.1, 2.2);
        assertTrue(c1.equals(c2));
    }

    