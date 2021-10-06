@Test 
    public void testGetRendererForDataset2() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);

        // add a second dataset
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.setValue(1, "R1", "C1");
        plot.setDataset(99, dataset2);
       
        // by default, the renderer with index 0 is used
        assertEquals(renderer, plot.getRendererForDataset(dataset2));
        
        // add a second renderer with the same index as dataset2, now it will
        // be used
        CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        plot.setRenderer(99, renderer2);
        assertEquals(renderer2, plot.getRendererForDataset(dataset2));
    }
    
    