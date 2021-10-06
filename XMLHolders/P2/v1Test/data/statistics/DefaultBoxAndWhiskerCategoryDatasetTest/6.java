@Test
    public void testConstructor() {
        DefaultBoxAndWhiskerCategoryDataset dataset
                = new DefaultBoxAndWhiskerCategoryDataset();
        assertEquals(0, dataset.getColumnCount());
        assertEquals(0, dataset.getRowCount());
        assertTrue(Double.isNaN(dataset.getRangeLowerBound(false)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(false)));
    }

    