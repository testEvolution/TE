@Test
    public void testGetRowIndex() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.0, "R1", "C1");
        underlying.addValue(2.0, "R2", "C1");
        underlying.addValue(3.0, "R3", "C1");
        underlying.addValue(4.0, "R4", "C1");
        SlidingCategoryDataset dataset = new SlidingCategoryDataset(underlying,
                1, 2);
        assertEquals(0, dataset.getRowIndex("R1"));
        assertEquals(1, dataset.getRowIndex("R2"));
        assertEquals(2, dataset.getRowIndex("R3"));
        assertEquals(3, dataset.getRowIndex("R4"));
    }

    