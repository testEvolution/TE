@Test
    public void testFindMaximumRangeValue() {
        CategoryDataset d1 = createCategoryDataset1();
        Number max1 = DatasetUtils.findMaximumRangeValue(d1);
        assertEquals(6.0, max1);

        XYDataset dataset = createXYDataset1();
        Number maximum = DatasetUtils.findMaximumRangeValue(dataset);
        assertEquals(105.0, maximum);
    }

    