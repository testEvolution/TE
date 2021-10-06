@Test
    public void testMapDatasetToRangeAxis() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);

        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setRangeAxis(22, yAxis2);
        
        // add a second dataset
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.setValue(1, "R1", "C1");
        plot.setDataset(99, dataset);    
        
        assertEquals(yAxis, plot.getRangeAxisForDataset(99));

        // now map the dataset to the second xAxis
        plot.mapDatasetToRangeAxis(99, 22);
        assertEquals(yAxis2, plot.getRangeAxisForDataset(99));
    }
    
    