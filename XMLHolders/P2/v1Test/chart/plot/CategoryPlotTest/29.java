@Test
    public void testAxisIndices() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);
        assertEquals(xAxis, plot.getDomainAxis(0));        
        assertEquals(yAxis, plot.getRangeAxis(0)); 
        
        CategoryAxis xAxis2 = new CategoryAxis("X2");
        plot.setDomainAxis(99, xAxis2);
        assertEquals(xAxis2, plot.getDomainAxis(99));
        
        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setRangeAxis(99, yAxis2);
        assertEquals(yAxis2, plot.getRangeAxis(99));
    }
    
    