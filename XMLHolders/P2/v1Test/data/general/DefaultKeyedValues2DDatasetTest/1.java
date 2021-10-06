@Test
    public void testSerialization() {
        DefaultKeyedValues2DDataset d1 = new DefaultKeyedValues2DDataset();
        d1.addValue(234.2, "Row1", "Col1");
        d1.addValue(null, "Row1", "Col2");
        d1.addValue(345.9, "Row2", "Col1");
        d1.addValue(452.7, "Row2", "Col2");

        DefaultKeyedValues2DDataset d2 = (DefaultKeyedValues2DDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

}