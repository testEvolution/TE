@Test
    public void testGetColumnCount() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        SlidingCategoryDataset dataset = new SlidingCategoryDataset(underlying,
                10, 2);
        assertEquals(0, dataset.getColumnCount());
        underlying.addValue(1.0, "R1", "C1");
        assertEquals(0, dataset.getColumnCount());
        underlying.addValue(1.0, "R1", "C2");
        assertEquals(0, dataset.getColumnCount());
        dataset.setFirstCategoryIndex(0);
        assertEquals(2, dataset.getColumnCount());
        underlying.addValue(1.0, "R1", "C3");
        assertEquals(2, dataset.getColumnCount());
        dataset.setFirstCategoryIndex(2);
        assertEquals(1, dataset.getColumnCount());
        underlying.clear();
        assertEquals(0, dataset.getColumnCount());
    }

    