@Test
    public void testEquals() {
        TimeSeriesCollection c1 = new TimeSeriesCollection();
        TimeSeriesCollection c2 = new TimeSeriesCollection();

        TimeSeries s1 = new TimeSeries("Series 1");
        TimeSeries s2 = new TimeSeries("Series 2");

        // newly created collections should be equal
        boolean b1 = c1.equals(c2);
        assertTrue(b1, "b1");

        // add series to collection 1, should be not equal
        c1.addSeries(s1);
        c1.addSeries(s2);
        boolean b2 = c1.equals(c2);
        assertFalse(b2, "b2");

        // now add the same series to collection 2 to make them equal again...
        c2.addSeries(s1);
        c2.addSeries(s2);
        boolean b3 = c1.equals(c2);
        assertTrue(b3, "b3");

        // now remove series 2 from collection 2
        c2.removeSeries(s2);
        boolean b4 = c1.equals(c2);
        assertFalse(b4, "b4");

        // now remove series 2 from collection 1 to make them equal again
        c1.removeSeries(s2);
        boolean b5 = c1.equals(c2);
        assertTrue(b5, "b5");
    }

    