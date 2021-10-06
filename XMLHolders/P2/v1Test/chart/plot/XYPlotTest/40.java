@Test 
    public void testGetRendererForDataset2() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        // add a second dataset
        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(new XYSeries("Series in dataset 2"));
        plot.setDataset(99, dataset2);
       
        // by default, the renderer with index 0 is used
        assertEquals(renderer, plot.getRendererForDataset(dataset2));
        
        // add a second renderer with the same index as dataset2, now it will
        // be used
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();
        plot.setRenderer(99, renderer);
        assertEquals(renderer2, plot.getRendererForDataset(dataset2));
    }
    
    