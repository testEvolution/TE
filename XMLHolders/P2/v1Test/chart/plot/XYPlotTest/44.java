@Test
    public void testRangeMarkerIndices() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        // add a second dataset, plotted against a second axis
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(new XYSeries("Series in dataset 2"));
        plot.setDataset(99, dataset);    
        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setRangeAxis(1, yAxis2);
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();
        plot.setRenderer(99, renderer2);
        plot.mapDatasetToRangeAxis(99, 1);
        
        ValueMarker yMarker1 = new ValueMarker(123);
        plot.addRangeMarker(99, yMarker1, Layer.FOREGROUND);
        assertTrue(plot.getRangeMarkers(99, Layer.FOREGROUND).contains(yMarker1));
    }
    
    