@Test
    public void testGetMinY2() {
        TimeSeries ts = new TimeSeries("Time Series");
        assertTrue(Double.isNaN(ts.getMinY()));
        
        ts.add(new Year(2014), 1.0);
        assertEquals(1.0, ts.getMinY(), EPSILON);
        
        ts.addOrUpdate(new Year(2014), null);
        assertTrue(Double.isNaN(ts.getMinY()));
        
        ts.addOrUpdate(new Year(2014), 1.0);
        assertEquals(1.0, ts.getMinY(), EPSILON);

        ts.clear();
        assertTrue(Double.isNaN(ts.getMinY()));
    }
    
    