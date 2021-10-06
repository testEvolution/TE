@Test
    public void testAdd() {
        VectorSeries series = new VectorSeries("Series", false, true);
        series.add(5.0, 5.50, 5.50, 5.50);
        series.add(5.1, 5.51, 5.51, 5.51);
        series.add(6.0, 6.6, 6.6, 6.6);
        series.add(3.0, 3.3, 3.3, 3.3);
        series.add(4.0, 4.4, 4.4, 4.4);
        series.add(2.0, 2.2, 2.2, 2.2);
        series.add(1.0, 1.1, 1.1, 1.1);
        assertEquals(5.5, series.getVectorXValue(0), EPSILON);
        assertEquals(5.51, series.getVectorXValue(1), EPSILON);
        assertEquals(6.6, series.getVectorXValue(2), EPSILON);
        assertEquals(3.3, series.getVectorXValue(3), EPSILON);
        assertEquals(4.4, series.getVectorXValue(4), EPSILON);
        assertEquals(2.2, series.getVectorXValue(5), EPSILON);
        assertEquals(1.1, series.getVectorXValue(6), EPSILON);
    }

    