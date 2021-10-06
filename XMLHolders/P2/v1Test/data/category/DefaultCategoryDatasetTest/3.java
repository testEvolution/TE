@Test
    public void testGetRowCount() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        assertTrue(d.getRowCount() == 0);

        d.addValue(1.0, "R1", "C1");
        assertTrue(d.getRowCount() == 1);

        d.addValue(1.0, "R2", "C1");
        assertTrue(d.getRowCount() == 2);

        d.addValue(2.0, "R2", "C1");
        assertTrue(d.getRowCount() == 2);

        // a row of all null values is still counted...
        d.setValue(null, "R2", "C1");
        assertTrue(d.getRowCount() == 2);
    }

    