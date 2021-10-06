@Test
    public void testNR() {
        BlockContainer c = createTestContainer1();
        RectangleConstraint constraint = RectangleConstraint.NONE.toRangeHeight(
                new Range(40.0, 60.0));
        Size2D s = c.arrange(null, constraint);
        assertEquals(90.0, s.width, EPSILON);
        assertEquals(40.0, s.height, EPSILON);
    }

    