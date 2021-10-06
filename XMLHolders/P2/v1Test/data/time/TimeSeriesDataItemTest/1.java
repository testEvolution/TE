@Test
    public void testEquals() {
        TimeSeriesDataItem item1 = new TimeSeriesDataItem(new Day(23, 9, 2001), 
                99.7);
        TimeSeriesDataItem item2 = new TimeSeriesDataItem(new Day(23, 9, 2001), 
                99.7);
        assertTrue(item1.equals(item2));
        assertTrue(item2.equals(item1));

        item1.setValue(5);
        assertFalse(item1.equals(item2));
        item2.setValue(5);
        assertTrue(item1.equals(item2));
    }

    