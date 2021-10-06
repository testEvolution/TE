@Test
    public void testFindMinimumStackedRangeValue2() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(-1.0, "R1", "C1");
        Number min = DatasetUtils.findMinimumStackedRangeValue(dataset);
        assertEquals(-1.0, min.doubleValue(), EPSILON);

        dataset.addValue(-2.0, "R2", "C1");
        min = DatasetUtils.findMinimumStackedRangeValue(dataset);
        assertEquals(-3.0, min.doubleValue(), EPSILON);
    }

    