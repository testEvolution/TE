@Test
    public void testIterateToFindRangeBounds_BoxAndWhiskerXYDataset() {
        DefaultBoxAndWhiskerXYDataset dataset
                = new DefaultBoxAndWhiskerXYDataset("Series 1");
        List<String> visibleSeriesKeys = new ArrayList<>();
        visibleSeriesKeys.add("Series 1");
        Range xRange = new Range(Double.NEGATIVE_INFINITY,
                Double.POSITIVE_INFINITY);
        assertNull(DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false));

        dataset.add(new Date(50L), new BoxAndWhiskerItem(5.0, 4.9, 2.0, 8.0,
                1.0, 9.0, 0.0, 10.0, new ArrayList<String>()));
        assertEquals(new Range(5.0, 5.0),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false));
        assertEquals(new Range(1.0, 9.0),
                DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, true));
    }

    