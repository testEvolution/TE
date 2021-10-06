@Test
    public void testGetRowCount() {
        DefaultMultiValueCategoryDataset d
                = new DefaultMultiValueCategoryDataset();
        assertTrue(d.getRowCount() == 0);
        List<Number> values = new ArrayList<>();
        d.add(values, "R1", "C1");
        assertTrue(d.getRowCount() == 1);

        d.add(values, "R2", "C1");
        assertTrue(d.getRowCount() == 2);

        d.add(values, "R2", "C1");
        assertTrue(d.getRowCount() == 2);
    }

    