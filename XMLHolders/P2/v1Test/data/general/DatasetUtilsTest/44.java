@Test
    public void testFindMaximumStackedRangeValue() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // an empty dataset should return a null max
        Number max = DatasetUtils.findMaximumStackedRangeValue(dataset);
        assertNull(max);

        dataset.addValue(1.0, "R1", "C1");
        max = DatasetUtils.findMaximumStackedRangeValue(dataset);
        assertEquals(1.0, max.doubleValue(), EPSILON);

        dataset.addValue(2.0, "R2", "C1");
        max = DatasetUtils.findMaximumStackedRangeValue(dataset);
        assertEquals(3.0, max.doubleValue(), EPSILON);

        dataset.addValue(-3.0, "R3", "C1");
        max = DatasetUtils.findMaximumStackedRangeValue(dataset);
        assertEquals(3.0, max.doubleValue(), EPSILON);

        dataset.addValue(Double.NaN, "R4", "C1");
        max = DatasetUtils.findMaximumStackedRangeValue(dataset);
        assertEquals(3.0, max.doubleValue(), EPSILON);
    }

    