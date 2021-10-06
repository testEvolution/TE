@Test
    public void testCombineIgnoringNaN() {
        Range r1 = new Range(1.0, 2.0);
        Range r2 = new Range(1.5, 2.5);

        assertNull(Range.combineIgnoringNaN(null, null));
        assertEquals(r1, Range.combineIgnoringNaN(r1, null));
        assertEquals(r2, Range.combineIgnoringNaN(null, r2));
        assertEquals(new Range(1.0, 2.5), Range.combineIgnoringNaN(r1, r2));

        Range r3 = new Range(Double.NaN, 1.3);
        Range rr = Range.combineIgnoringNaN(r1, r3);
        assertEquals(1.0, rr.getLowerBound(), EPSILON);
        assertEquals(2.0, rr.getUpperBound(), EPSILON);

        Range r4 = new Range(1.7, Double.NaN);
        rr = Range.combineIgnoringNaN(r4, r1);
        assertEquals(1.0, rr.getLowerBound(), EPSILON);
        assertEquals(2.0, rr.getUpperBound(), EPSILON);
    }
    
    