@Test
    public void testIterateRangeBounds_CategoryDataset() {
        CategoryDataset dataset = createCategoryDataset1();
        Range r = DatasetUtils.iterateRangeBounds(dataset, false);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(6.0, r.getUpperBound(), EPSILON);
    }

    