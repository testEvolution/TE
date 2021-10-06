@Test
    public void testCumulativeRange_NaN() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series 1", "Start");
        dataset.addValue(15.0, "Series 1", "Delta 1");
        dataset.addValue(Double.NaN, "Series 1", "Delta 2");
        Range range = DatasetUtils.findCumulativeRangeBounds(dataset);
        assertEquals(0.0, range.getLowerBound(), EPSILON);
        assertEquals(25.0, range.getUpperBound(), EPSILON);
    }

    