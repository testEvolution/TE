@Test
    public void testHashcode() {
        OHLCSeriesCollection c1 = new OHLCSeriesCollection();
        OHLCSeries s1 = new OHLCSeries("S");
        s1.add(new Year(2009), 1.0, 4.0, 0.5, 2.0);
        c1.addSeries(s1);
        OHLCSeriesCollection c2 = new OHLCSeriesCollection();
        OHLCSeries s2 = new OHLCSeries("S");
        s2.add(new Year(2009), 1.0, 4.0, 0.5, 2.0);
        c2.addSeries(s2);
        assertTrue(c1.equals(c2));
        int h1 = c1.hashCode();
        int h2 = c2.hashCode();
        assertEquals(h1, h2);
    }

    