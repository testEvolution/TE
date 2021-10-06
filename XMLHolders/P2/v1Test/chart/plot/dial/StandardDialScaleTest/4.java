@Test
    public void testValueToAngle() {
        StandardDialScale s = new StandardDialScale();
        assertEquals(175.0, s.valueToAngle(0.0), EPSILON);
        assertEquals(90.0, s.valueToAngle(50.0), EPSILON);
        assertEquals(5.0, s.valueToAngle(100.0), EPSILON);
        assertEquals(192.0, s.valueToAngle(-10.0), EPSILON);
        assertEquals(-12.0, s.valueToAngle(110.0), EPSILON);

        s = new StandardDialScale(0, 20, 180, -180.0, 10, 3);
        assertEquals(180.0, s.valueToAngle(0.0), EPSILON);
        assertEquals(90.0, s.valueToAngle(10.0), EPSILON);
        assertEquals(0.0, s.valueToAngle(20.0), EPSILON);
    }

    