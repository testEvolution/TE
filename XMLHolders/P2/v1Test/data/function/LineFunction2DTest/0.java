@Test
    public void testConstructor() {
        LineFunction2D f = new LineFunction2D(1.0, 2.0);
        assertEquals(1.0, f.getIntercept(), EPSILON);
        assertEquals(2.0, f.getSlope(), EPSILON);
    }



    