@Test
    public void testCalculateConstrainedSize() {
        Size2D s;

        // NONE / NONE
        RectangleConstraint c1 = RectangleConstraint.NONE;
        s = c1.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 1.2, EPSILON);
        assertEquals(s.height, 3.4, EPSILON);

        // NONE / RANGE
        RectangleConstraint c2 = new RectangleConstraint(
            0.0, new Range(0.0, 0.0), LengthConstraintType.NONE,
            0.0, new Range(2.0, 3.0), LengthConstraintType.RANGE
        );
        s = c2.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 1.2, EPSILON);
        assertEquals(s.height, 3.0, EPSILON);

        // NONE / FIXED
        RectangleConstraint c3 = new RectangleConstraint(
            0.0, null, LengthConstraintType.NONE,
            9.9, null, LengthConstraintType.FIXED
        );
        s = c3.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 1.2, EPSILON);
        assertEquals(s.height, 9.9, EPSILON);

        // RANGE / NONE
        RectangleConstraint c4 = new RectangleConstraint(
            0.0, new Range(2.0, 3.0), LengthConstraintType.RANGE,
            0.0, new Range(0.0, 0.0), LengthConstraintType.NONE
        );
        s = c4.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 2.0, EPSILON);
        assertEquals(s.height, 3.4, EPSILON);

        // RANGE / RANGE
        RectangleConstraint c5 = new RectangleConstraint(
            0.0, new Range(2.0, 3.0), LengthConstraintType.RANGE,
            0.0, new Range(2.0, 3.0), LengthConstraintType.RANGE
        );
        s = c5.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 2.0, EPSILON);
        assertEquals(s.height, 3.0, EPSILON);

        // RANGE / FIXED
        RectangleConstraint c6 = new RectangleConstraint(
            0.0, null, LengthConstraintType.NONE,
            9.9, null, LengthConstraintType.FIXED
        );
        s = c6.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 1.2, EPSILON);
        assertEquals(s.height, 9.9, EPSILON);

        // FIXED / NONE
        RectangleConstraint c7 = RectangleConstraint.NONE;
        s = c7.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 1.2, EPSILON);
        assertEquals(s.height, 3.4, EPSILON);

        // FIXED / RANGE
        RectangleConstraint c8 = new RectangleConstraint(
            0.0, new Range(0.0, 0.0), LengthConstraintType.NONE,
            0.0, new Range(2.0, 3.0), LengthConstraintType.RANGE
        );
        s = c8.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 1.2, EPSILON);
        assertEquals(s.height, 3.0, EPSILON);

        // FIXED / FIXED
        RectangleConstraint c9 = new RectangleConstraint(
            0.0, null, LengthConstraintType.NONE,
            9.9, null, LengthConstraintType.FIXED
        );
        s = c9.calculateConstrainedSize(new Size2D(1.2, 3.4));
        assertEquals(s.width, 1.2, EPSILON);
        assertEquals(s.height, 9.9, EPSILON);
    }
}