@Test 
    public void testAxisLocationIndices() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        NumberAxis xAxis2 = new NumberAxis("X2");
        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setDomainAxis(99, xAxis2);
        plot.setRangeAxis(99, yAxis2);
        
        plot.setDomainAxisLocation(99, AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, 
                plot.getDomainAxisLocation(99));
        plot.setRangeAxisLocation(99, AxisLocation.BOTTOM_OR_LEFT);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, 
                plot.getRangeAxisLocation(99));
    }
    
    