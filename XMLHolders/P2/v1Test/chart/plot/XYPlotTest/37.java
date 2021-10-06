@Test
    public void testAxisIndices() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        assertEquals(xAxis, plot.getDomainAxis(0));        
        assertEquals(yAxis, plot.getRangeAxis(0)); 
        
        NumberAxis xAxis2 = new NumberAxis("X2");
        plot.setDomainAxis(99, xAxis2);
        assertEquals(xAxis2, plot.getDomainAxis(99));
        
        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setRangeAxis(99, yAxis2);
        assertEquals(yAxis2, plot.getRangeAxis(99));
    }
    
    