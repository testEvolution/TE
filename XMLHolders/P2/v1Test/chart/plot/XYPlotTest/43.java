@Test
    public void testDomainMarkerIndices() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        // add a second dataset, plotted against a second x axis
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(new XYSeries("Series in dataset 2"));
        plot.setDataset(99, dataset);    
        NumberAxis xAxis2 = new NumberAxis("X2");
        plot.setDomainAxis(1, xAxis2);
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();
        plot.setRenderer(99, renderer2);
        plot.mapDatasetToDomainAxis(99, 1);
        
        ValueMarker xMarker1 = new ValueMarker(123);
        plot.addDomainMarker(99, xMarker1, Layer.FOREGROUND);
        assertTrue(plot.getDomainMarkers(99, Layer.FOREGROUND).contains(
                xMarker1));
    }

    