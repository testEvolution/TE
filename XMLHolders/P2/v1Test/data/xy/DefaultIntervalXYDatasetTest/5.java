@Test
    public void testGetStartXValue() {
        DefaultIntervalXYDataset d = createSampleDataset1();
        assertEquals(0.9, d.getStartXValue(0, 0), EPSILON);
        assertEquals(1.9, d.getStartXValue(0, 1), EPSILON);
        assertEquals(2.9, d.getStartXValue(0, 2), EPSILON);
        assertEquals(10.9, d.getStartXValue(1, 0), EPSILON);
        assertEquals(11.9, d.getStartXValue(1, 1), EPSILON);
        assertEquals(12.9, d.getStartXValue(1, 2), EPSILON);
    }

    