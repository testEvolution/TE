@Test
    public void testMapDatasetToDomainAxis() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);

        CategoryAxis xAxis2 = new CategoryAxis("X2");
        plot.setDomainAxis(11, xAxis2);
        
        // add a second dataset
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.setValue(1, "R1", "C1");
        plot.setDataset(99, dataset);    
        
        assertEquals(xAxis, plot.getDomainAxisForDataset(99));

        // now map the dataset to the second xAxis
        plot.mapDatasetToDomainAxis(99, 11);
        assertEquals(xAxis2, plot.getDomainAxisForDataset(99));
    }

    