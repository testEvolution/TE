@Test
    public void testGetColumnKeys() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.0, "R1", "C1");
        underlying.addValue(2.0, "R1", "C2");
        underlying.addValue(3.0, "R1", "C3");
        underlying.addValue(4.0, "R1", "C4");
        SlidingCategoryDataset dataset = new SlidingCategoryDataset(underlying,
                1, 2);
        List keys = dataset.getColumnKeys();
        assertTrue(keys.contains("C2"));
        assertTrue(keys.contains("C3"));
        assertEquals(2, keys.size());

        dataset.setFirstCategoryIndex(3);
        keys = dataset.getColumnKeys();
        assertTrue(keys.contains("C4"));
        assertEquals(1, keys.size());
    }

}