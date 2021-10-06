@Test
    public void testFindRangeBounds_CategoryDataset() {
        CategoryDataset dataset = createCategoryDataset1();
        Range r = DatasetUtils.findRangeBounds(dataset);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(6.0, r.getUpperBound(), EPSILON);
    }

    