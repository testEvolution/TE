@Test
    public void testGetColumnIndex() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.0, "R1", "C1");
        underlying.addValue(2.0, "R1", "C2");
        underlying.addValue(3.0, "R1", "C3");
        underlying.addValue(4.0, "R1", "C4");
        SlidingCategoryDataset dataset = new SlidingCategoryDataset(underlying,
                1, 2);
        assertEquals(-1, dataset.getColumnIndex("C1"));
        assertEquals(0, dataset.getColumnIndex("C2"));
        assertEquals(1, dataset.getColumnIndex("C3"));
        assertEquals(-1, dataset.getColumnIndex("C4"));
    }

    