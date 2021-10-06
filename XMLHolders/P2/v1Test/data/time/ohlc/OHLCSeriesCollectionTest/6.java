@Test
    public void testRemoveSeries() {
        OHLCSeriesCollection c1 = new OHLCSeriesCollection();
        OHLCSeries s1 = new OHLCSeries("Series 1");
        OHLCSeries s2 = new OHLCSeries("Series 2");
        OHLCSeries s3 = new OHLCSeries("Series 3");
        OHLCSeries s4 = new OHLCSeries("Series 4");
        c1.addSeries(s1);
        c1.addSeries(s2);
        c1.addSeries(s3);
        c1.addSeries(s4);
        c1.removeSeries(s3);
        assertTrue(c1.getSeries(2).equals(s4));
        c1.removeSeries(s1);
        assertTrue(c1.getSeries(0).equals(s2));
        assertEquals(2, c1.getSeriesCount());
    }

    