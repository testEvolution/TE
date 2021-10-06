@Test
    public void testUpdateByIndex2() {
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, Double.NaN);

        assertTrue(Double.isNaN(s1.getMinY()));
        assertTrue(Double.isNaN(s1.getMaxY()));

        s1.updateByIndex(0, 1.0);
        assertEquals(1.0, s1.getMinY(), EPSILON);
        assertEquals(1.0, s1.getMaxY(), EPSILON);

        s1.updateByIndex(0, 2.0);
        assertEquals(2.0, s1.getMinY(), EPSILON);
        assertEquals(2.0, s1.getMaxY(), EPSILON);

        s1.add(-1.0, -1.0);
        s1.updateByIndex(0, 0.0);
        assertEquals(0.0, s1.getMinY(), EPSILON);
        assertEquals(2.0, s1.getMaxY(), EPSILON);
    }

    