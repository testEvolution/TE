@Test
    public void testConstructor() {
        Outlier out = new Outlier(1.0, 2.0, 3.0);
        assertEquals(-2.0, out.getX(), EPSILON);
        assertEquals(-1.0, out.getY(), EPSILON);
        assertEquals(3.0, out.getRadius(), EPSILON);
    }

    