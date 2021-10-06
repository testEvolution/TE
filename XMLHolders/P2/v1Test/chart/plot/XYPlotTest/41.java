@Test
    public void testMapDatasetToDomainAxis() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        NumberAxis xAxis2 = new NumberAxis("X2");
        plot.setDomainAxis(11, xAxis2);
        
        // add a second dataset
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(new XYSeries("Series in dataset 2"));
        plot.setDataset(99, dataset);    
        
        assertEquals(xAxis, plot.getDomainAxisForDataset(99));

        // now map the dataset to the second xAxis
        plot.mapDatasetToDomainAxis(99, 11);
        assertEquals(xAxis2, plot.getDomainAxisForDataset(99));
    }

    