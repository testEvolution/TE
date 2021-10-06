@Test
    public void testCumulativeRange1() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Series 1", "Start");
        dataset.addValue(15.0, "Series 1", "Delta 1");
        dataset.addValue(-7.0, "Series 1", "Delta 2");
        Range range = DatasetUtils.findCumulativeRangeBounds(dataset);
        assertEquals(0.0, range.getLowerBound(), 0.00000001);
        assertEquals(25.0, range.getUpperBound(), 0.00000001);
    }

    