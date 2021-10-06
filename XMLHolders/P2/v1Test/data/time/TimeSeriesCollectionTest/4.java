@Test
    public void testSerialization() {
        TimeSeriesCollection c1 = new TimeSeriesCollection(createSeries());
        TimeSeriesCollection c2 = (TimeSeriesCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    