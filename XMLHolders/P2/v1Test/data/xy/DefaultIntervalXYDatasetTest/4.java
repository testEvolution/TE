@Test
    public void testGetYValue() {
        DefaultIntervalXYDataset d = createSampleDataset1();
        assertEquals(4.0, d.getYValue(0, 0), EPSILON);
        assertEquals(5.0, d.getYValue(0, 1), EPSILON);
        assertEquals(6.0, d.getYValue(0, 2), EPSILON);
        assertEquals(14.0, d.getYValue(1, 0), EPSILON);
        assertEquals(15.0, d.getYValue(1, 1), EPSILON);
        assertEquals(16.0, d.getYValue(1, 2), EPSILON);
    }

    