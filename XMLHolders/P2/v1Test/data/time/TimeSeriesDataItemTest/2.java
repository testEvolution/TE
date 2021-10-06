@Test
    public void testSerialization() {
        TimeSeriesDataItem item1 = new TimeSeriesDataItem(new Day(23, 9, 2001), 
                99.7);
        TimeSeriesDataItem item2 = (TimeSeriesDataItem) 
                TestUtils.serialised(item1);
        assertEquals(item1, item2);
    }

}