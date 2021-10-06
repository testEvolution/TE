@Test
    public void testConstructor2() {
        LookupPaintScale s = new LookupPaintScale(1.0, 2.0, Color.RED);
        assertEquals(1.0, s.getLowerBound(), EPSILON);
        assertEquals(2.0, s.getUpperBound(), EPSILON);
        assertEquals(Color.RED, s.getDefaultPaint());
    }

    