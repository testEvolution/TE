@Test
    public void testGetEndXValue() {
        DefaultIntervalXYDataset d = createSampleDataset1();
        assertEquals(1.1, d.getEndXValue(0, 0), EPSILON);
        assertEquals(2.1, d.getEndXValue(0, 1), EPSILON);
        assertEquals(3.1, d.getEndXValue(0, 2), EPSILON);
        assertEquals(11.1, d.getEndXValue(1, 0), EPSILON);
        assertEquals(12.1, d.getEndXValue(1, 1), EPSILON);
        assertEquals(13.1, d.getEndXValue(1, 2), EPSILON);
    }

    