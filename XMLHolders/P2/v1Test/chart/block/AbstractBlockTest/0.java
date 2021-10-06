@Test
    public void testEquals() {
        EmptyBlock b1 = new EmptyBlock(1.0, 2.0);
        EmptyBlock b2 = new EmptyBlock(1.0, 2.0);
        assertTrue(b1.equals(b2));
        assertTrue(b2.equals(b2));

        b1.setID("Test");
        assertFalse(b1.equals(b2));
        b2.setID("Test");
        assertTrue(b1.equals(b2));

        b1.setMargin(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertFalse(b1.equals(b2));
        b2.setMargin(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertTrue(b1.equals(b2));

        b1.setFrame(new BlockBorder(Color.RED));
        assertFalse(b1.equals(b2));
        b2.setFrame(new BlockBorder(Color.RED));
        assertTrue(b1.equals(b2));

        b1.setPadding(new RectangleInsets(2.0, 4.0, 6.0, 8.0));
        assertFalse(b1.equals(b2));
        b2.setPadding(new RectangleInsets(2.0, 4.0, 6.0, 8.0));
        assertTrue(b1.equals(b2));

        b1.setWidth(1.23);
        assertFalse(b1.equals(b2));
        b2.setWidth(1.23);
        assertTrue(b1.equals(b2));

        b1.setHeight(4.56);
        assertFalse(b1.equals(b2));
        b2.setHeight(4.56);
        assertTrue(b1.equals(b2));

        b1.setBounds(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertFalse(b1.equals(b2));
        b2.setBounds(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertTrue(b1.equals(b2));

        b1 = new EmptyBlock(1.1, 2.0);
        assertFalse(b1.equals(b2));
        b2 = new EmptyBlock(1.1, 2.0);
        assertTrue(b1.equals(b2));

        b1 = new EmptyBlock(1.1, 2.2);
        assertFalse(b1.equals(b2));
        b2 = new EmptyBlock(1.1, 2.2);
        assertTrue(b1.equals(b2));
    }

    