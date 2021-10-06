@Test 
    public void testRendererIndices() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);
        
        assertEquals(renderer, plot.getRenderer(0));
        
        // we should be able to give a renderer an arbitrary index
        CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        plot.setRenderer(20, renderer2);
        assertEquals(2, plot.getRendererCount());
        assertEquals(renderer2, plot.getRenderer(20));
        
        assertEquals(20, plot.getIndexOf(renderer2));
    }

    