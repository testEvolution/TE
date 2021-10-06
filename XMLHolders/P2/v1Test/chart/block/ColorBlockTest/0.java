@Test
    public void testEquals() {
        ColorBlock b1 = new ColorBlock(Color.RED, 1.0, 2.0);
        ColorBlock b2 = new ColorBlock(Color.RED, 1.0, 2.0);
        assertTrue(b1.equals(b2));
        assertTrue(b2.equals(b2));

        b1 = new ColorBlock(Color.BLUE, 1.0, 2.0);
        assertFalse(b1.equals(b2));
        b2 = new ColorBlock(Color.BLUE, 1.0, 2.0);
        assertTrue(b1.equals(b2));

        b1 = new ColorBlock(Color.BLUE, 1.1, 2.0);
        assertFalse(b1.equals(b2));
        b2 = new ColorBlock(Color.BLUE, 1.1, 2.0);
        assertTrue(b1.equals(b2));

        b1 = new ColorBlock(Color.BLUE, 1.1, 2.2);
        assertFalse(b1.equals(b2));
        b2 = new ColorBlock(Color.BLUE, 1.1, 2.2);
        assertTrue(b1.equals(b2));
    }

    