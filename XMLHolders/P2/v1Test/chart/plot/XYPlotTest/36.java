@Test
    public void testDatasetIndices() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        assertEquals(dataset, plot.getDataset(0));
        
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(new XYSeries("Series in dataset 2"));
        
        // we should be able to give a dataset an arbitrary index
        plot.setDataset(99, dataset2);
        assertEquals(2, plot.getDatasetCount());
        assertEquals(dataset2, plot.getDataset(99));
        
        assertEquals(0, plot.indexOf(dataset));
        assertEquals(99, plot.indexOf(dataset2));
    }
    
    