@Test
    public void testRemoveSeries() {
        TimeSeriesCollection c1 = new TimeSeriesCollection();

        TimeSeries s1 = new TimeSeries("Series 1");
        TimeSeries s2 = new TimeSeries("Series 2");
        TimeSeries s3 = new TimeSeries("Series 3");
        TimeSeries s4 = new TimeSeries("Series 4");

        c1.addSeries(s1);
        c1.addSeries(s2);
        c1.addSeries(s3);
        c1.addSeries(s4);

        c1.removeSeries(s3);

        TimeSeries s = c1.getSeries(2);
        boolean b1 = s.equals(s4);
        assertTrue(b1);
    }

    