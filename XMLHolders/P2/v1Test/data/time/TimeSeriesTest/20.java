@Test
    public void testAddOrUpdate4() {
        TimeSeries ts = new TimeSeries("S");
        TimeSeriesDataItem overwritten = ts.addOrUpdate(new Year(2009), 20.09);
        assertNull(overwritten);
        overwritten = ts.addOrUpdate(new Year(2009), 1.0);
        assertEquals(20.09, overwritten.getValue());
        assertEquals(1.0, ts.getValue(new Year(2009)));

        // changing the overwritten record shouldn't affect the series
        overwritten.setValue(null);
        assertEquals(1.0, ts.getValue(new Year(2009)));

        TimeSeriesDataItem item = new TimeSeriesDataItem(new Year(2010), 20.10);
        overwritten = ts.addOrUpdate(item);
        assertNull(overwritten);
        assertEquals(20.10, ts.getValue(new Year(2010)));
        // changing the item that was added should not change the series
        item.setValue(null);
        assertEquals(20.10, ts.getValue(new Year(2010)));
    }

    