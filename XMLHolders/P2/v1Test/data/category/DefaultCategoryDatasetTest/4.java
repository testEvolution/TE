@Test
    public void testGetColumnCount() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        assertTrue(d.getColumnCount() == 0);

        d.addValue(1.0, "R1", "C1");
        assertTrue(d.getColumnCount() == 1);

        d.addValue(1.0, "R1", "C2");
        assertTrue(d.getColumnCount() == 2);

        d.addValue(2.0, "R1", "C2");
        assertTrue(d.getColumnCount() == 2);

        // a column of all null values is still counted...
        d.setValue(null, "R1", "C2");
        assertTrue(d.getColumnCount() == 2);
    }

    