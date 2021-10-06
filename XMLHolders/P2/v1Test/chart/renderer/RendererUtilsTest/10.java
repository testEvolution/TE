@Test
    public void test3561093() {
        XYSeries s = new XYSeries("S1", false);
        s.add(0.0, 0.0);
        s.add(21.0, 0.0);
        s.add(2.0, 0.0);
        s.add(23.0, 0.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        
        assertEquals(1, RendererUtils.findLiveItemsLowerBound(dataset, 0, 
                10.0, 20.0));
        assertEquals(2, RendererUtils.findLiveItemsUpperBound(dataset, 0, 
                10.0, 20.0));
        
        int[] bounds = RendererUtils.findLiveItems(dataset, 0, 10.0, 20.0);
        assertEquals(1, bounds[0]);
        assertEquals(2, bounds[1]);
    }

}