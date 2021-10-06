@Test
    public void testGetSeriesIndex() {
        // check an empty dataset
        DefaultIntervalCategoryDataset empty
                = new DefaultIntervalCategoryDataset(new double[0][0],
                        new double[0][0]);
        assertEquals(-1, empty.getSeriesIndex("ABC"));
    }

    