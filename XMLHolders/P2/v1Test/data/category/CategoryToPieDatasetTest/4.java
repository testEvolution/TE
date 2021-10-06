@Test
    public void testEquals() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.1, "R1", "C1");
        underlying.addValue(2.2, "R1", "C2");
        CategoryToPieDataset d1 = new CategoryToPieDataset(underlying,
                TableOrder.BY_COLUMN, 1);
        DefaultPieDataset d2 = new DefaultPieDataset();
        d2.setValue("R1", 2.2);
        assertTrue(d1.equals(d2));
    }

    