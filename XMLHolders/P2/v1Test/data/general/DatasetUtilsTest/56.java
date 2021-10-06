@Test
    public void testIterateToFindRangeBounds_MultiValueCategoryDataset() {
        DefaultMultiValueCategoryDataset dataset
                = new DefaultMultiValueCategoryDataset();
        List<String> visibleSeriesKeys = new ArrayList<>();
        assertNull(DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, true));
        List<Double> values = Arrays.asList(new Double[] {1.0});
        dataset.add(values, "R1", "C1");
        visibleSeriesKeys.add("R1");
        assertEquals(new Range(1.0, 1.0),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, true));

        values = Arrays.asList(new Double[] {2.0, 3.0});
        dataset.add(values, "R1", "C2");
        assertEquals(new Range(1.0, 3.0),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, true));

        values = Arrays.asList(new Double[] {-1.0, -2.0});
        dataset.add(values, "R2", "C1");
        assertEquals(new Range(1.0, 3.0),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, true));
        visibleSeriesKeys.add("R2");
        assertEquals(new Range(-2.0, 3.0),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, true));
    }

    