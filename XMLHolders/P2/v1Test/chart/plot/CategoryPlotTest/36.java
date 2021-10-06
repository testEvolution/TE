@Test
    public void testRangeMarkerIndices() {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis xAxis = new CategoryAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer);
        
        // add a second dataset, plotted against a second axis
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.setValue(1, "R1", "C1");
        plot.setDataset(99, dataset);    
        NumberAxis yAxis2 = new NumberAxis("Y2");
        plot.setRangeAxis(1, yAxis2);
        LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
        plot.setRenderer(99, renderer2);
        plot.mapDatasetToRangeAxis(99, 1);
        
        ValueMarker yMarker1 = new ValueMarker(123);
        plot.addRangeMarker(99, yMarker1, Layer.FOREGROUND);
        assertTrue(plot.getRangeMarkers(99, Layer.FOREGROUND).contains(
                yMarker1));
    }

}