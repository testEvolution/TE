@Test
    public void testNullBlock_FR() {
        BlockContainer c = new BlockContainer(new GridArrangement(1, 1));
        c.add(null);
        Size2D s = c.arrange(null, new RectangleConstraint(30.0, new Range(5.0,
                10.0)));
        assertEquals(30.0, s.getWidth(), EPSILON);
        assertEquals(5.0, s.getHeight(), EPSILON);
    }

    