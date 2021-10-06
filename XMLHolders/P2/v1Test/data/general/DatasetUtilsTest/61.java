@Test
    public void testFindYValue() {
        XYSeries series = new XYSeries("S1");
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 100.0)));
        
        series.add(1.0, 5.0);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 0.0)));
        assertEquals(5.0, DatasetUtils.findYValue(dataset, 0, 1.0), EPSILON);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 2.0)));
        
        series.add(2.0, 10.0);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 0.0)));
        assertEquals(5.0, DatasetUtils.findYValue(dataset, 0, 1.0), EPSILON);
        assertEquals(6.25, DatasetUtils.findYValue(dataset, 0, 1.25), EPSILON);
        assertEquals(7.5, DatasetUtils.findYValue(dataset, 0, 1.5), EPSILON);
        assertEquals(10.0, DatasetUtils.findYValue(dataset, 0, 2.0), EPSILON);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 3.0)));
    }
    
    