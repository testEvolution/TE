@Test
    public void testNF() {
        BlockContainer c = createTestContainer1();
        RectangleConstraint constraint = RectangleConstraint.NONE.toFixedHeight(
                100.0);
        Size2D s = c.arrange(null, constraint);
        assertEquals(90.0, s.width, EPSILON);
        assertEquals(100.0, s.height, EPSILON);
    }

    