@Test
    public void testGridNotFull_FF() {
        Block b1 = new EmptyBlock(5, 5);
        BlockContainer c = new BlockContainer(new GridArrangement(2, 3));
        c.add(b1);
        Size2D s = c.arrange(null, new RectangleConstraint(200, 100));
        assertEquals(200.0, s.getWidth(), EPSILON);
        assertEquals(100.0, s.getHeight(), EPSILON);
    }

    