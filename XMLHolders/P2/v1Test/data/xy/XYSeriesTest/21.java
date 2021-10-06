@Test
    public void testSetMaximumItemCount4() {
        XYSeries s1 = new XYSeries("S1");
        s1.setMaximumItemCount(2);
        s1.add(1.0, 1.1);
        s1.add(2.0, 2.2);
        s1.add(3.0, 3.3);
        assertEquals(2.0, s1.getX(0).doubleValue(), EPSILON);
        assertEquals(3.0, s1.getX(1).doubleValue(), EPSILON);
        assertEquals(2.0, s1.getMinX(), EPSILON);
        assertEquals(3.0, s1.getMaxX(), EPSILON);
        assertEquals(2.2, s1.getMinY(), EPSILON);
        assertEquals(3.3, s1.getMaxY(), EPSILON);
    }

    