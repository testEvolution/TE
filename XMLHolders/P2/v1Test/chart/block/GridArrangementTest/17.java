@Test
    public void testGridNotFull_FR() {
        Block b1 = new EmptyBlock(5, 5);
        BlockContainer c = new BlockContainer(new GridArrangement(2, 3));
        c.add(b1);
        Size2D s = c.arrange(null, new RectangleConstraint(30.0, new Range(5.0,
                10.0)));
        assertEquals(30.0, s.getWidth(), EPSILON);
        assertEquals(10.0, s.getHeight(), EPSILON);
    }

    