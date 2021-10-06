@Test
    public void testRR() {
        BlockContainer c = createTestContainer1();
        RectangleConstraint constraint = new RectangleConstraint(new Range(40.0,
                60.0), new Range(50.0, 70.0));
        Size2D s = c.arrange(null, constraint);
        assertEquals(60.0, s.width, EPSILON);
        assertEquals(50.0, s.height, EPSILON);
    }

    