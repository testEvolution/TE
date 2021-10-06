@Test
    public void testGetRowKeys() {
        // check an empty dataset
        DefaultIntervalCategoryDataset empty
                = new DefaultIntervalCategoryDataset(new double[0][0],
                        new double[0][0]);
        List<?> keys = empty.getRowKeys();
        assertEquals(0, keys.size());
    }

    