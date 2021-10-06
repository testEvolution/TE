@Test
    public void testGetEndYValue() {
        DefaultIntervalXYDataset d = createSampleDataset1();
        assertEquals(1.11, d.getEndYValue(0, 0), EPSILON);
        assertEquals(2.11, d.getEndYValue(0, 1), EPSILON);
        assertEquals(3.11, d.getEndYValue(0, 2), EPSILON);
        assertEquals(11.11, d.getEndYValue(1, 0), EPSILON);
        assertEquals(12.11, d.getEndYValue(1, 1), EPSILON);
        assertEquals(13.11, d.getEndYValue(1, 2), EPSILON);
    }

    