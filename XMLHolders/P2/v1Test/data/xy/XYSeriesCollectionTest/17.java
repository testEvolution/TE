@Test
    public void testSeriesRename() {
        // first check that a valid renaming works
        XYSeries series1 = new XYSeries("A");
        XYSeries series2 = new XYSeries("B");
        XYSeriesCollection collection = new XYSeriesCollection();
        collection.addSeries(series1);
        collection.addSeries(series2);
        series1.setKey("C");
        assertEquals("C", collection.getSeries(0).getKey());
        
        // next, check that setting a duplicate key fails
        try {
            series2.setKey("C");
            fail("Expected an IllegalArgumentException.");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
        assertEquals("B", series2.getKey());  // the series name should not 
        // change because "C" is already the key for the other series in the
        // collection
    }
}