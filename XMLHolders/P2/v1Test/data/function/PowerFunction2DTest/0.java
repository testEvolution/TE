@Test
    public void testConstructor() {
        PowerFunction2D f = new PowerFunction2D(1.0, 2.0);
        assertEquals(1.0, f.getA(), EPSILON);
        assertEquals(2.0, f.getB(), EPSILON);
    }

    