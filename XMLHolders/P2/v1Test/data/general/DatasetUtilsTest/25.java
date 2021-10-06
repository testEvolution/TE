@Test
    public void test803660() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100.0, "Series 1", "Type 1");
        dataset.addValue(101.1, "Series 1", "Type 2");
        Number n = DatasetUtils.findMaximumRangeValue(dataset);
        assertTrue(n.doubleValue() > 101.0);
    }

    