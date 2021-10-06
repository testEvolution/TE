@Test
    public void testEqualsSelf() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Day(23, 9, 2001), 
                99.7);
        assertTrue(item.equals(item));
    }

    