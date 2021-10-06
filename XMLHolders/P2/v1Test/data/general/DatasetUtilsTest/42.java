@Test
    public void testFindMinimumStackedRangeValue() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // an empty dataset should return a null max
        Number min = DatasetUtils.findMinimumStackedRangeValue(dataset);
        assertNull(min);

        dataset.addValue(1.0, "R1", "C1");
        min = DatasetUtils.findMinimumStackedRangeValue(dataset);
        assertEquals(0.0, min.doubleValue(), EPSILON);

        dataset.addValue(2.0, "R2", "C1");
        min = DatasetUtils.findMinimumStackedRangeValue(dataset);
        assertEquals(0.0, min.doubleValue(), EPSILON);

        dataset.addValue(-3.0, "R3", "C1");
        min = DatasetUtils.findMinimumStackedRangeValue(dataset);
        assertEquals(-3.0, min.doubleValue(), EPSILON);

        dataset.addValue(Double.NaN, "R4", "C1");
        min = DatasetUtils.findMinimumStackedRangeValue(dataset);
        assertEquals(-3.0, min.doubleValue(), EPSILON);
    }

    