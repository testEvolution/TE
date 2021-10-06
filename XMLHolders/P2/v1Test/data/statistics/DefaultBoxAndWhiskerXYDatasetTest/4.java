@Test
    public void testConstructor() {
        DefaultBoxAndWhiskerXYDataset dataset
                = new DefaultBoxAndWhiskerXYDataset("S1");
        assertEquals(1, dataset.getSeriesCount());
        assertEquals(0, dataset.getItemCount(0));
        assertTrue(Double.isNaN(dataset.getRangeLowerBound(false)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(false)));
    }

    