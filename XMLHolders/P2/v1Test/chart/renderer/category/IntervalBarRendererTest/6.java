@Test
    public void testFindRangeBounds() {
        IntervalBarRenderer r = new IntervalBarRenderer();
        assertNull(r.findRangeBounds(null));

        // an empty dataset should return a null range
        DefaultIntervalCategoryDataset dataset
                = new DefaultIntervalCategoryDataset(new double[0][0],
                new double[0][0]);
        assertNull(r.findRangeBounds(dataset));

        double[][] starts = new double[][] {{0.1, 0.2, 0.3}, {0.3, 0.4, 0.5}};
        double[][] ends = new double[][] {{0.5, 0.6, 0.7}, {0.7, 0.8, 0.9}};
        dataset = new DefaultIntervalCategoryDataset(starts, ends);
        assertEquals(new Range(0.0, 0.9), r.findRangeBounds(dataset));
        r.setIncludeBaseInRange(false);
        assertEquals(new Range(0.1, 0.9), r.findRangeBounds(dataset));
        r.setIncludeBaseInRange(true);

        r.setSeriesVisible(1, Boolean.FALSE);
        assertEquals(new Range(0.0, 0.7), r.findRangeBounds(dataset));
    }

}