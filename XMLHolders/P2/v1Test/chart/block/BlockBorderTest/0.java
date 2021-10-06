@Test
    public void testEquals() {
        BlockBorder b1 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0,
                4.0), Color.RED);
        BlockBorder b2 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0,
                4.0), Color.RED);
        assertTrue(b1.equals(b2));
        assertTrue(b2.equals(b2));

        // insets
        b1 = new BlockBorder(new RectangleInsets(UnitType.RELATIVE, 1.0, 2.0,
                3.0, 4.0), Color.RED);
        assertFalse(b1.equals(b2));
        b2 = new BlockBorder(new RectangleInsets(UnitType.RELATIVE, 1.0, 2.0,
                3.0, 4.0), Color.RED);
        assertTrue(b1.equals(b2));

        // paint
        b1 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0, 4.0),
                Color.BLUE);
        assertFalse(b1.equals(b2));
        b2 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0, 4.0),
                Color.BLUE);
        assertTrue(b1.equals(b2));
    }

    