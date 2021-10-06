@Test
    public void testIterateRangeBounds2_CategoryDataset() {
        // an empty dataset should return a null range
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Range r = DatasetUtils.iterateRangeBounds(dataset, false);
        assertNull(r);

        // a dataset with a single value
        dataset.addValue(1.23, "R1", "C1");
        r = DatasetUtils.iterateRangeBounds(dataset, false);
        assertEquals(1.23, r.getLowerBound(), EPSILON);
        assertEquals(1.23, r.getUpperBound(), EPSILON);

        // null is ignored
        dataset.addValue(null, "R2", "C1");
        r = DatasetUtils.iterateRangeBounds(dataset, false);
        assertEquals(1.23, r.getLowerBound(), EPSILON);
        assertEquals(1.23, r.getUpperBound(), EPSILON);

        // a Double.NaN should be ignored
        dataset.addValue(Double.NaN, "R2", "C1");
        r = DatasetUtils.iterateRangeBounds(dataset, false);
        assertEquals(1.23, r.getLowerBound(), EPSILON);
        assertEquals(1.23, r.getUpperBound(), EPSILON);
    }

    