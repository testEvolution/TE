@Test
    public void testGetDataRangeWithMultipleDatasets() {
        XYSeriesCollection dataset1 = new XYSeriesCollection();
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset1, xAxis, yAxis, renderer);
        plot.setDataset(1, dataset2);
        plot.mapDatasetToDomainAxis(1, 0);
        plot.mapDatasetToRangeAxis(1, 0);
        assertEquals(null, plot.getDataRange(xAxis));
        assertEquals(null, plot.getDataRange(yAxis));
        
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 2.0);
        dataset1.addSeries(s1);
        assertEquals(new Range(1.0, 1.0), plot.getDataRange(xAxis));
        assertEquals(new Range(2.0, 2.0), plot.getDataRange(yAxis));
        
        XYSeries s2 = new XYSeries("S2");
        s2.add(5.0, 10.0);
        dataset2.addSeries(s2);
        assertEquals(new Range(1.0, 5.0), plot.getDataRange(xAxis));
        assertEquals(new Range(2.0, 10.0), plot.getDataRange(yAxis));
        
        s2.add(6.0, Double.NaN);
        assertEquals(new Range(1.0, 6.0), plot.getDataRange(xAxis));
        assertEquals(new Range(2.0, 10.0), plot.getDataRange(yAxis));
        
        s2.add(Double.NaN, 0.5); 
        assertEquals(new Range(1.0, 6.0), plot.getDataRange(xAxis));
        assertEquals(new Range(2.0, 10.0), plot.getDataRange(yAxis)); // only y-values for items in the x-range        
    }    
}