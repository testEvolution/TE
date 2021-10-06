@Test
    public void testAdditionOfDuplicateXValues() {
        XIntervalSeries s1 = new XIntervalSeries("Series 1");
        s1.add(1.0, 1.0, 1.0, 1.0);
        s1.add(2.0, 2.0, 2.0, 2.0);
        s1.add(2.0, 3.0, 3.0, 3.0);
        s1.add(2.0, 4.0, 4.0, 4.0);
        s1.add(3.0, 5.0, 5.0, 5.0);
        assertEquals(1.0, s1.getYValue(0), EPSILON);
        assertEquals(2.0, s1.getYValue(1), EPSILON);
        assertEquals(3.0, s1.getYValue(2), EPSILON);
        assertEquals(4.0, s1.getYValue(3), EPSILON);
        assertEquals(5.0, s1.getYValue(4), EPSILON);
    }

    