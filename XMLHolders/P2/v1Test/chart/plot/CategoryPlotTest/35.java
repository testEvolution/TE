@Test
    public void testDomainMarkerIndices() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);
        
        // add a second dataset, plotted against a second x axis
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.setValue(1, "R1", "C1");
        plot.setDataset(99, dataset);    
        CategoryAxis xAxis2 = new CategoryAxis("X2");
        plot.setDomainAxis(1, xAxis2);
        LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
        plot.setRenderer(99, renderer2);
        plot.mapDatasetToDomainAxis(99, 1);
        
        CategoryMarker xMarker1 = new CategoryMarker(123);
        plot.addDomainMarker(99, xMarker1, Layer.FOREGROUND);
        assertTrue(plot.getDomainMarkers(99, Layer.FOREGROUND).contains(
                xMarker1));
    }

    