@Test
    public void testGetRowIndex() {
        // check an empty dataset
        DefaultIntervalCategoryDataset empty
                = new DefaultIntervalCategoryDataset(new double[0][0],
                        new double[0][0]);
        assertEquals(-1, empty.getRowIndex("ABC"));
    }

    