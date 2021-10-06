@Test
    public void testGetMinY() {
        XYSeries s1 = new XYSeries("S1");
        assertTrue(Double.isNaN(s1.getMinY()));

        s1.add(1.0, 1.1);
        assertEquals(1.1, s1.getMinY(), EPSILON);

        s1.add(2.0, 2.2);
        assertEquals(1.1, s1.getMinY(), EPSILON);

        s1.add(Double.NaN, 99.9);
        assertEquals(1.1, s1.getMinY(), EPSILON);

        s1.add(-1.0, -1.1);
        assertEquals(-1.1, s1.getMinY(), EPSILON);

        s1.add(0.0, null);
        assertEquals(-1.1, s1.getMinY(), EPSILON);
   }

    