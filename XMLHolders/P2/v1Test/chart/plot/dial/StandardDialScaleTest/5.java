@Test
    public void testAngleToValue() {
        StandardDialScale s = new StandardDialScale();
        assertEquals(0.0, s.angleToValue(175.0), EPSILON);
        assertEquals(50.0, s.angleToValue(90.0), EPSILON);
        assertEquals(100.0, s.angleToValue(5.0), EPSILON);
        assertEquals(-10.0, s.angleToValue(192.0), EPSILON);
        assertEquals(110.0, s.angleToValue(-12.0), EPSILON);

        s = new StandardDialScale(0, 20, 180, -180.0, 10, 3);
        assertEquals(0.0, s.angleToValue(180.0), EPSILON);
        assertEquals(10.0, s.angleToValue(90.0), EPSILON);
        assertEquals(20.0, s.angleToValue(0.0), EPSILON);
    }
}