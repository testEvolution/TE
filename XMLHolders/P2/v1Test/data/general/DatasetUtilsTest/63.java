@Test
    public void testFindYValueWithDuplicates() {
        XYSeries series = new XYSeries("S1", true, true);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 100.0)));
        
        series.add(1.0, 5.0);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 0.0)));
        assertEquals(5.0, DatasetUtils.findYValue(dataset, 0, 1.0), EPSILON);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 2.0)));
        
        series.add(1.0, 10.0);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 0.0)));
        assertEquals(5.0, DatasetUtils.findYValue(dataset, 0, 1.0), EPSILON);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 2.0)));
        
        series.add(2.0, 10.0);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 0.0)));
        assertEquals(5.0, DatasetUtils.findYValue(dataset, 0, 1.0), EPSILON);
        assertEquals(10.0, DatasetUtils.findYValue(dataset, 0, 1.25), EPSILON);
        assertEquals(10.0, DatasetUtils.findYValue(dataset, 0, 1.5), EPSILON);
        assertEquals(10.0, DatasetUtils.findYValue(dataset, 0, 2.0), EPSILON);
        assertTrue(Double.isNaN(DatasetUtils.findYValue(dataset, 0, 3.0)));
    }

}