@Test
    public void testGetMaxY2() {
        TimeSeries ts = new TimeSeries("Time Series");
        assertTrue(Double.isNaN(ts.getMaxY()));
        
        ts.add(new Year(2014), 1.0);
        assertEquals(1.0, ts.getMaxY(), EPSILON);
        
        ts.addOrUpdate(new Year(2014), null);
        assertTrue(Double.isNaN(ts.getMaxY()));
        
        ts.addOrUpdate(new Year(2014), 1.0);
        assertEquals(1.0, ts.getMaxY(), EPSILON);

        ts.clear();
        assertTrue(Double.isNaN(ts.getMaxY()));
    }

    