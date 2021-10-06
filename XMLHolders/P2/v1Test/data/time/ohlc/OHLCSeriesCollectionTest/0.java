@Test
    public void testEquals() {
        OHLCSeriesCollection c1 = new OHLCSeriesCollection();
        OHLCSeriesCollection c2 = new OHLCSeriesCollection();
        assertEquals(c1, c2);

        // add a series
        OHLCSeries s1 = new OHLCSeries("Series");
        s1.add(new Year(2006), 1.0, 1.1, 1.2, 1.3);
        c1.addSeries(s1);
        assertFalse(c1.equals(c2));
        OHLCSeries s2 = new OHLCSeries("Series");
        s2.add(new Year(2006), 1.0, 1.1, 1.2, 1.3);
        c2.addSeries(s2);
        assertTrue(c1.equals(c2));

        // add an empty series
        c1.addSeries(new OHLCSeries("Empty Series"));
        assertFalse(c1.equals(c2));
        c2.addSeries(new OHLCSeries("Empty Series"));
        assertTrue(c1.equals(c2));

        c1.setXPosition(TimePeriodAnchor.END);
        assertFalse(c1.equals(c2));
        c2.setXPosition(TimePeriodAnchor.END);
        assertTrue(c1.equals(c2));

    }

    