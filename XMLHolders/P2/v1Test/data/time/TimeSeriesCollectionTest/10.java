@Test
    public void testBug3445507() {
        TimeSeries s1 = new TimeSeries("S1");
        s1.add(new Year(2011), null);
        s1.add(new Year(2012), null);

        TimeSeries s2 = new TimeSeries("S2");
        s2.add(new Year(2011), 5.0);
        s2.add(new Year(2012), 6.0);

        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(s1);
        dataset.addSeries(s2);

        List<String> keys = new ArrayList<>();
        keys.add("S1");
        keys.add("S2");
        Range r = dataset.getRangeBounds(keys, new Range(
                Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), false);
        assertEquals(5.0, r.getLowerBound(), EPSILON);
        assertEquals(6.0, r.getUpperBound(), EPSILON);
    }

    