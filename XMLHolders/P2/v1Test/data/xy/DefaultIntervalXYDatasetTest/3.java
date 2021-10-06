@Test
    public void testGetXValue() {
        DefaultIntervalXYDataset d = createSampleDataset1();
        assertEquals(1.0, d.getXValue(0, 0), EPSILON);
        assertEquals(2.0, d.getXValue(0, 1), EPSILON);
        assertEquals(3.0, d.getXValue(0, 2), EPSILON);
        assertEquals(11.0, d.getXValue(1, 0), EPSILON);
        assertEquals(12.0, d.getXValue(1, 1), EPSILON);
        assertEquals(13.0, d.getXValue(1, 2), EPSILON);
    }

    