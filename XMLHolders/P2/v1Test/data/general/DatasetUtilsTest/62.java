@Test
    public void testFindYValueNonSorted() {
        XYSeries series = new XYSeries("S1", false);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 100.0)));
        
        series.add(1.0, 5.0);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 0.0)));
        assertEquals(5.0, DatasetUtils.findYValue(dataset, 0, 1.0), EPSILON);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 2.0)));
        
        series.add(0.0, 10.0);
        series.add(4.0, 20.0);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, -0.5)));
        assertEquals(10.0, DatasetUtils.findYValue(dataset, 0, 0.0), EPSILON);
        assertEquals(5.0, DatasetUtils.findYValue(dataset, 0, 1.0), EPSILON);
        assertEquals(15.0, DatasetUtils.findYValue(dataset, 0, 2.0), EPSILON);
        assertEquals(20.0, DatasetUtils.findYValue(dataset, 0, 4.0), EPSILON);
        assertEquals(17.5, DatasetUtils.findYValue(dataset, 0, 3.0), EPSILON);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 5.0)));        
    }
    
    