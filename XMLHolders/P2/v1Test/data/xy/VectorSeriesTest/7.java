@Test
    public void testAdditionOfDuplicateXValues() {
        VectorSeries s1 = new VectorSeries("Series 1");
        s1.add(1.0, 1.0, 1.0, 1.0);
        s1.add(2.0, 2.0, 2.0, 2.0);
        s1.add(2.0, 2.0, 3.0, 3.0);
        s1.add(2.0, 3.0, 4.0, 4.0);
        s1.add(3.0, 5.0, 5.0, 5.0);
        assertEquals(1.0, s1.getVectorXValue(0), EPSILON);
        assertEquals(2.0, s1.getVectorXValue(1), EPSILON);
        assertEquals(3.0, s1.getVectorXValue(2), EPSILON);
        assertEquals(4.0, s1.getVectorXValue(3), EPSILON);
        assertEquals(5.0, s1.getVectorXValue(4), EPSILON);
    }

    