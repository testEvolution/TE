@Test
    public void testGetRangeBounds() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        // when the dataset contains no series, we expect the value range to 
        // be null
        assertNull(dataset.getRangeBounds(false));
        assertNull(dataset.getRangeBounds(true));

        // when the dataset contains one or more series, but those series 
        // contain no items, we expect the value range to be null
        XYSeries series = new XYSeries("S1");
        dataset.addSeries(series);
        assertNull(dataset.getRangeBounds(false));
        assertNull(dataset.getRangeBounds(true));

        // tests with values
        series.add(1.0, 1.1);
        assertEquals(new Range(1.1, 1.1), dataset.getRangeBounds(false));
        assertEquals(new Range(1.1, 1.1), dataset.getRangeBounds(true));

        series.add(-1.0, -1.1);
        assertEquals(new Range(-1.1, 1.1), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.1, 1.1), dataset.getRangeBounds(true));
        
        series.add(0.0, null);
        assertEquals(new Range(-1.1, 1.1), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.1, 1.1), dataset.getRangeBounds(true));
        
        XYSeries s2 = new XYSeries("S2");
        dataset.addSeries(s2);
        assertEquals(new Range(-1.1, 1.1), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.1, 1.1), dataset.getRangeBounds(true));
        
        s2.add(2.0, 5.0);
        assertEquals(new Range(-1.1, 5.0), dataset.getRangeBounds(false));
        assertEquals(new Range(-1.1, 5.0), dataset.getRangeBounds(true));
    }

    