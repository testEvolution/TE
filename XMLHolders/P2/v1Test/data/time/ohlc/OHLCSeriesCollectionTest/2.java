@Test
    public void testSerialization() {
        OHLCSeriesCollection c1 = new OHLCSeriesCollection();
        OHLCSeries s1 = new OHLCSeries("Series");
        s1.add(new Year(2006), 1.0, 1.1, 1.2, 1.3);
        c1.addSeries(s1);
        OHLCSeriesCollection c2 = (OHLCSeriesCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    