@Test
    public void testGetRangeUpperBound() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        // when the dataset contains no series, we expect the value range to 
        // be null
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(false)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(true)));

        // when the dataset contains one or more series, but those series 
        // contain no items, we expect the value range to be null
        XYSeries series = new XYSeries("S1");
        dataset.addSeries(series);
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(false)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(true)));

        // tests with values
        series.add(1.0, 1.1);
        assertEquals(1.1, dataset.getRangeUpperBound(false), EPSILON);
        assertEquals(1.1, dataset.getRangeUpperBound(true), EPSILON);

        series.add(-1.0, -1.1);
        assertEquals(1.1, dataset.getRangeUpperBound(false), EPSILON);
        assertEquals(1.1, dataset.getRangeUpperBound(true), EPSILON);
        
        series.add(0.0, null);
        assertEquals(1.1, dataset.getRangeUpperBound(false), EPSILON);
        assertEquals(1.1, dataset.getRangeUpperBound(true), EPSILON);
        
        XYSeries s2 = new XYSeries("S2");
        dataset.addSeries(s2);
        assertEquals(1.1, dataset.getRangeUpperBound(false), EPSILON);
        assertEquals(1.1, dataset.getRangeUpperBound(true), EPSILON);
        
        s2.add(2.0, 5.0);
        assertEquals(5.0, dataset.getRangeUpperBound(false), EPSILON);
        assertEquals(5.0, dataset.getRangeUpperBound(true), EPSILON);
    }
    
    