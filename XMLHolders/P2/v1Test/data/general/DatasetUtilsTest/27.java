@Test
    public void testCumulativeRange2() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(-21.4, "Series 1", "Start Value");
        dataset.addValue(11.57, "Series 1", "Delta 1");
        dataset.addValue(3.51, "Series 1", "Delta 2");
        dataset.addValue(-12.36, "Series 1", "Delta 3");
        dataset.addValue(3.39, "Series 1", "Delta 4");
        dataset.addValue(38.68, "Series 1", "Delta 5");
        dataset.addValue(-43.31, "Series 1", "Delta 6");
        dataset.addValue(-29.59, "Series 1", "Delta 7");
        dataset.addValue(35.30, "Series 1", "Delta 8");
        dataset.addValue(5.0, "Series 1", "Delta 9");
        Range range = DatasetUtils.findCumulativeRangeBounds(dataset);
        assertEquals(-49.51, range.getLowerBound(), 0.00000001);
        assertEquals(23.39, range.getUpperBound(), 0.00000001);
    }

    