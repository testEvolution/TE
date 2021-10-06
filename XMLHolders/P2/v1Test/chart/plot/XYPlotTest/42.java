@Test
    public void testMapDatasetToRangeAxis() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setRangeAxis(22, yAxis2);
        
        // add a second dataset
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(new XYSeries("Series in dataset 2"));
        plot.setDataset(99, dataset);    
        
        assertEquals(yAxis, plot.getRangeAxisForDataset(99));

        // now map the dataset to the second xAxis
        plot.mapDatasetToRangeAxis(99, 22);
        assertEquals(yAxis2, plot.getRangeAxisForDataset(99));
    }
    
    