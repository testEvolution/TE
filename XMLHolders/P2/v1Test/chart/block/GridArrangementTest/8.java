@Test
    public void testRN() {
        BlockContainer c = createTestContainer1();
        RectangleConstraint constraint = RectangleConstraint.NONE.toRangeWidth(
                new Range(40.0, 60.0));
        Size2D s = c.arrange(null, constraint);
        assertEquals(60.0, s.width, EPSILON);
        assertEquals(33.0, s.height, EPSILON);
    }

    