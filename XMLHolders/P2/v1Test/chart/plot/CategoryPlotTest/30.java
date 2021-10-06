@Test 
    public void testAxisLocationIndices() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);

        CategoryAxis xAxis2 = new CategoryAxis("X2");
        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setDomainAxis(99, xAxis2);
        plot.setRangeAxis(99, yAxis2);
        
        plot.setDomainAxisLocation(99, AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, 
                plot.getDomainAxisLocation(99));
        plot.setRangeAxisLocation(99, AxisLocation.BOTTOM_OR_LEFT);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, 
                plot.getRangeAxisLocation(99));
    }
    
    