@Test
    public void testFindRangeBounds() {
        XYBlockRenderer renderer = new XYBlockRenderer();
        assertNull(renderer.findRangeBounds(null));

        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("S1");
        series.add(1.0, null);
        dataset.addSeries(series);
        Range r = renderer.findRangeBounds(dataset);
        assertNull(r);
    }
    
    