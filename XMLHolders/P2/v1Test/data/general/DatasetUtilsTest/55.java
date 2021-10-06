@Test
    public void testIterateToFindRangeBounds_StatisticalCategoryDataset() {
        DefaultStatisticalCategoryDataset dataset
                = new DefaultStatisticalCategoryDataset();
        List<String> visibleSeriesKeys = new ArrayList<>();
        assertNull(DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, false));
        dataset.add(1.0, 0.5, "R1", "C1");
        visibleSeriesKeys.add("R1");
        assertEquals(new Range(1.0, 1.0),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, false));
        assertEquals(new Range(0.5, 1.5),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, true));
    }

    