@Test
    public void testGetRangeBounds() {
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        
        // when the dataset contains no series, we expect the range to be null
        assertNull(dataset.getRangeBounds(false));
        assertNull(dataset.getRangeBounds(true));

        // when the dataset contains one or more series, but those series
        // contain no items, we still expect the range to be null
        TimeSeries s1 = new TimeSeries("S1");
        dataset.addSeries(s1);
        assertNull(dataset.getRangeBounds(false));
        assertNull(dataset.getRangeBounds(true));

        // tests with values
        s1.add(new Year(2012), 1.0);
        assertEquals(new Range(1.0, 1.0), dataset.getRangeBounds(false));
        assertEquals(new Range(1.0, 1.0), dataset.getRangeBounds(true));
        s1.add(new Year(2013), -1.0);
        assertEquals(new Range(-1.0, 1.0), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.0, 1.0), dataset.getRangeBounds(true));
        s1.add(new Year(2014), null);
        assertEquals(new Range(-1.0, 1.0), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.0, 1.0), dataset.getRangeBounds(true));
        
        // adding a second series
        TimeSeries s2 = new TimeSeries("S2");
        dataset.addSeries(s2);
        assertEquals(new Range(-1.0, 1.0), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.0, 1.0), dataset.getRangeBounds(true));
        
        s2.add(new Year(2014), 5.0);
        assertEquals(new Range(-1.0, 5.0), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.0, 5.0), dataset.getRangeBounds(true));
        
        dataset.removeAllSeries();
        assertNull(dataset.getRangeBounds(false));
        assertNull(dataset.getRangeBounds(true));
        
        s1 = new TimeSeries("s1");
        s2 = new TimeSeries("s2");
        dataset.addSeries(s1);
        dataset.addSeries(s2);
        assertNull(dataset.getRangeBounds(false));
        assertNull(dataset.getRangeBounds(true));
        
        s2.add(new Year(2014), 100.0);
        assertEquals(new Range(100.0, 100.0), dataset.getRangeBounds(false));
        assertEquals(new Range(100.0, 100.0), dataset.getRangeBounds(true));
    }

    