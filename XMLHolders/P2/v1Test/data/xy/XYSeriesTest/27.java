@Test
    public void testGetMaxX() {
        XYSeries s1 = new XYSeries("S1");
        assertTrue(Double.isNaN(s1.getMaxX()));

        s1.add(1.0, 1.1);
        assertEquals(1.0, s1.getMaxX(), EPSILON);

        s1.add(2.0, 2.2);
        assertEquals(2.0, s1.getMaxX(), EPSILON);

        s1.add(Double.NaN, 99.9);
        assertEquals(2.0, s1.getMaxX(), EPSILON);

        s1.add(-1.0, -1.1);
        assertEquals(2.0, s1.getMaxX(), EPSILON);

        s1.add(0.0, null);
        assertEquals(2.0, s1.getMaxX(), EPSILON);
    }

    