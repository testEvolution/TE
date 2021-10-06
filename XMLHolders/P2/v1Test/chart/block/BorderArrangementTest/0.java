@Test
    public void testEquals() {
        BorderArrangement b1 = new BorderArrangement();
        BorderArrangement b2 = new BorderArrangement();
        assertTrue(b1.equals(b2));
        assertTrue(b2.equals(b1));

        b1.add(new EmptyBlock(99.0, 99.0), null);
        assertFalse(b1.equals(b2));
        b2.add(new EmptyBlock(99.0, 99.0), null);
        assertTrue(b1.equals(b2));

        b1.add(new EmptyBlock(1.0, 1.0), RectangleEdge.LEFT);
        assertFalse(b1.equals(b2));
        b2.add(new EmptyBlock(1.0, 1.0), RectangleEdge.LEFT);
        assertTrue(b1.equals(b2));

        b1.add(new EmptyBlock(2.0, 2.0), RectangleEdge.RIGHT);
        assertFalse(b1.equals(b2));
        b2.add(new EmptyBlock(2.0, 2.0), RectangleEdge.RIGHT);
        assertTrue(b1.equals(b2));

        b1.add(new EmptyBlock(3.0, 3.0), RectangleEdge.TOP);
        assertFalse(b1.equals(b2));
        b2.add(new EmptyBlock(3.0, 3.0), RectangleEdge.TOP);
        assertTrue(b1.equals(b2));

        b1.add(new EmptyBlock(4.0, 4.0), RectangleEdge.BOTTOM);
        assertFalse(b1.equals(b2));
        b2.add(new EmptyBlock(4.0, 4.0), RectangleEdge.BOTTOM);
        assertTrue(b1.equals(b2));
    }

    