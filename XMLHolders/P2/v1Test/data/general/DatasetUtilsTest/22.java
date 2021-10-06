@Test
    public void testFindMinimumRangeValue() {
        CategoryDataset d1 = createCategoryDataset1();
        Number min1 = DatasetUtils.findMinimumRangeValue(d1);
        assertEquals(1.0, min1);

        XYDataset d2 = createXYDataset1();
        Number min2 = DatasetUtils.findMinimumRangeValue(d2);
        assertEquals(100.0, min2);
    }

    