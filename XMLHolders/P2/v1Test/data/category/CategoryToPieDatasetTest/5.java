@Test
    public void testSerialization() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.1, "R1", "C1");
        underlying.addValue(2.2, "R1", "C2");
        CategoryToPieDataset d1 = new CategoryToPieDataset(underlying,
                TableOrder.BY_COLUMN, 1);
        CategoryToPieDataset d2 = (CategoryToPieDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);

        // regular equality for the datasets doesn't check the fields, just
        // the data values...so let's check some more things...
        assertEquals(d1.getUnderlyingDataset(), d2.getUnderlyingDataset());
        assertEquals(d1.getExtractType(), d2.getExtractType());
        assertEquals(d1.getExtractIndex(), d2.getExtractIndex());
    }

}