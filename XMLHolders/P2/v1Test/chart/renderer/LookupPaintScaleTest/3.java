@Test
    public void testConstructor1() {
        LookupPaintScale s = new LookupPaintScale();
        assertEquals(0.0, s.getLowerBound(), EPSILON);
        assertEquals(1.0, s.getUpperBound(), EPSILON);
    }

    