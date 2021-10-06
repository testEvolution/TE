@Test
    public void testRemoveSeries_int() {
        TimeSeriesCollection c1 = new TimeSeriesCollection();
        TimeSeries s1 = new TimeSeries("Series 1");
        TimeSeries s2 = new TimeSeries("Series 2");
        TimeSeries s3 = new TimeSeries("Series 3");
        TimeSeries s4 = new TimeSeries("Series 4");
        c1.addSeries(s1);
        c1.addSeries(s2);
        c1.addSeries(s3);
        c1.addSeries(s4);
        c1.removeSeries(2);
        assertTrue(c1.getSeries(2).equals(s4));
        c1.removeSeries(0);
        assertTrue(c1.getSeries(0).equals(s2));
        assertEquals(2, c1.getSeriesCount());
    }

    