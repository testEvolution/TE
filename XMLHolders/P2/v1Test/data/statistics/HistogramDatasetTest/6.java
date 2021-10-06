@Test
    public void testAddSeries2() {
        double[] values = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
        HistogramDataset hd = new HistogramDataset();
        hd.addSeries("S1", values, 5);
        assertEquals(0.0, hd.getStartXValue(0, 0), EPSILON);
        assertEquals(1.0, hd.getEndXValue(0, 0), EPSILON);
        assertEquals(1.0, hd.getYValue(0, 0), EPSILON);
        assertEquals(1.0, hd.getStartXValue(0, 1), EPSILON);
        assertEquals(2.0, hd.getEndXValue(0, 1), EPSILON);
        assertEquals(1.0, hd.getYValue(0, 1), EPSILON);
        assertEquals(2.0, hd.getStartXValue(0, 2), EPSILON);
        assertEquals(3.0, hd.getEndXValue(0, 2), EPSILON);
        assertEquals(1.0, hd.getYValue(0, 2), EPSILON);
        assertEquals(3.0, hd.getStartXValue(0, 3), EPSILON);
        assertEquals(4.0, hd.getEndXValue(0, 3), EPSILON);
        assertEquals(1.0, hd.getYValue(0, 3), EPSILON);
        assertEquals(4.0, hd.getStartXValue(0, 4), EPSILON);
        assertEquals(5.0, hd.getEndXValue(0, 4), EPSILON);
        assertEquals(2.0, hd.getYValue(0, 4), EPSILON);
    }

    