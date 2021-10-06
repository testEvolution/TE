@Test
    public void testGetColumnCount() {
        DefaultMultiValueCategoryDataset d
                = new DefaultMultiValueCategoryDataset();
        assertTrue(d.getColumnCount() == 0);

        List<Number> values = new ArrayList<>();
        d.add(values, "R1", "C1");
        assertTrue(d.getColumnCount() == 1);

        d.add(values, "R1", "C2");
        assertTrue(d.getColumnCount() == 2);

        d.add(values, "R1", "C2");
        assertTrue(d.getColumnCount() == 2);

    }

    