@Test
    public void testGetColumnCount() {
        // check an empty dataset
        DefaultIntervalCategoryDataset empty
                = new DefaultIntervalCategoryDataset(new double[0][0],
                        new double[0][0]);
        assertEquals(0, empty.getColumnCount());
    }

    