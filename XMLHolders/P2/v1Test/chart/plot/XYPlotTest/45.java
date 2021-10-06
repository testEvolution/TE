@Test
    public void testGetDataRange() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        assertEquals(null, plot.getDataRange(xAxis));
        assertEquals(null, plot.getDataRange(yAxis));
        
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 2.0);
        dataset.addSeries(s1);
        assertEquals(new Range(1.0, 1.0), plot.getDataRange(xAxis));
        assertEquals(new Range(2.0, 2.0), plot.getDataRange(yAxis));
        
        s1.add(5.0, null);
        assertEquals(new Range(1.0, 5.0), plot.getDataRange(xAxis));
        assertEquals(new Range(2.0, 2.0), plot.getDataRange(yAxis));
        
        s1.add(6.0, Double.NaN);
        assertEquals(new Range(1.0, 6.0), plot.getDataRange(xAxis));
        assertEquals(new Range(2.0, 2.0), plot.getDataRange(yAxis));
    }
    
    