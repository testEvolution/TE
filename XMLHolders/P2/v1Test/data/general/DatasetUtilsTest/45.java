@Test
    public void testFindMaximumStackedRangeValue2() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(-1.0, "R1", "C1");
        Number max = DatasetUtils.findMaximumStackedRangeValue(dataset);
        assertEquals(0.0, max.doubleValue(), EPSILON);

        dataset.addValue(-2.0, "R2", "C1");
        max = DatasetUtils.findMaximumStackedRangeValue(dataset);
        assertEquals(0.0, max.doubleValue(), EPSILON);
    }

    