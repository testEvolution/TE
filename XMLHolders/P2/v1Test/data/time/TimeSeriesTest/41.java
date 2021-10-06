@Test
    public void testAdd_TimeSeriesDataItem() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Year(2009), 1.0);
        TimeSeries series = new TimeSeries("S1");
        series.add(item);
        assertTrue(item.equals(series.getDataItem(0)));
        item.setValue(99.9);
        assertFalse(item.equals(series.getDataItem(0)));
    }
    
    