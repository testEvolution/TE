@Test
    public void testFindValueRange() {
        TimeSeries ts = new TimeSeries("Time Series");
        assertNull(ts.findValueRange());
        
        ts.add(new Year(2014), 1.0);
        assertEquals(new Range(1.0, 1.0), ts.findValueRange());
        
        ts.add(new Year(2015), 2.0);
        assertEquals(new Range(1.0, 2.0), ts.findValueRange());

        // null items are ignored
        ts.add(new Year(2016), null);
        assertEquals(new Range(1.0, 2.0), ts.findValueRange());
        
        // Double.NaN values are also ignored
        ts.add(new Year(2017), Double.NaN);
        assertEquals(new Range(1.0, 2.0), ts.findValueRange());
        
        ts.clear();
        assertNull(ts.findValueRange());
        
        // if there are only null items, we get a NaNRange
        ts.add(new Year(2014), null);
        assertTrue(ts.findValueRange().isNaNRange()); 
    }

    