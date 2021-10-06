@Test
    public void testRemoveAllSeries() {
        OHLCSeriesCollection c1 = new OHLCSeriesCollection();
        c1.addChangeListener(this);

        // there should be no change event when clearing an empty series
        this.lastEvent = null;
        c1.removeAllSeries();
        assertNull(this.lastEvent);

        OHLCSeries s1 = new OHLCSeries("Series 1");
        OHLCSeries s2 = new OHLCSeries("Series 2");
        c1.addSeries(s1);
        c1.addSeries(s2);
        c1.removeAllSeries();
        assertEquals(0, c1.getSeriesCount());
        assertNotNull(this.lastEvent);
        this.lastEvent = null;  // clean up
    }

    