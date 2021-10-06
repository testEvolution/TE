@Test
    public void testGetRowCount() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        SlidingCategoryDataset dataset = new SlidingCategoryDataset(underlying,
                10, 5);
        assertEquals(0, dataset.getRowCount());
        underlying.addValue(1.0, "R1", "C1");
        assertEquals(1, dataset.getRowCount());

        underlying.clear();
        assertEquals(0, dataset.getRowCount());
    }

    