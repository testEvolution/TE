@Test 
    public void testRendererIndices() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        assertEquals(renderer, plot.getRenderer(0));
        
        // we should be able to give a renderer an arbitrary index
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();
        plot.setRenderer(20, renderer2);
        assertEquals(2, plot.getRendererCount());
        assertEquals(renderer2, plot.getRenderer(20));
        
        assertEquals(20, plot.getIndexOf(renderer2));
    }

    