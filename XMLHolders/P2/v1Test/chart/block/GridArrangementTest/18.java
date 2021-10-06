@Test
    public void testGridNotFull_NN() {
        Block b1 = new EmptyBlock(5, 5);
        BlockContainer c = new BlockContainer(new GridArrangement(2, 3));
        c.add(b1);
        Size2D s = c.arrange(null, RectangleConstraint.NONE);
        assertEquals(15.0, s.getWidth(), EPSILON);
        assertEquals(10.0, s.getHeight(), EPSILON);
    }

}