@Test
    public void testFindStackedRangeBounds_CategoryDataset1() {
        CategoryDataset d1 = createCategoryDataset1();
        Range r = DatasetUtils.findStackedRangeBounds(d1);
        assertEquals(0.0, r.getLowerBound(), EPSILON);
        assertEquals(15.0, r.getUpperBound(), EPSILON);

        d1 = createCategoryDataset2();
        r = DatasetUtils.findStackedRangeBounds(d1);
        assertEquals(-2.0, r.getLowerBound(), EPSILON);
        assertEquals(2.0, r.getUpperBound(), EPSILON);
    }

    