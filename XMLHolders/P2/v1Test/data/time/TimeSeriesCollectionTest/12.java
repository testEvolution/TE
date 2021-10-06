@Test
    public void testGetRangeBounds2() {
        TimeZone tzone = TimeZone.getTimeZone("Europe/London");
        Calendar calendar = new GregorianCalendar(tzone, Locale.UK);
        calendar.clear();
        calendar.set(2014, Calendar.FEBRUARY, 23, 6, 0);
        long start = calendar.getTimeInMillis();
        calendar.clear();
        calendar.set(2014, Calendar.FEBRUARY, 24, 18, 0);
        long end = calendar.getTimeInMillis();
        Range range = new Range(start, end);
        
        TimeSeriesCollection collection = new TimeSeriesCollection(tzone);
        assertNull(collection.getRangeBounds(Collections.EMPTY_LIST, range, 
                true));
        
        TimeSeries s1 = new TimeSeries("S1");
        s1.add(new Day(24, 2, 2014), 10.0);
        collection.addSeries(s1);
        assertEquals(new Range(10.0, 10.0), collection.getRangeBounds(
                Arrays.asList("S1"), range, true));
        collection.setXPosition(TimePeriodAnchor.MIDDLE);
        assertEquals(new Range(10.0, 10.0), collection.getRangeBounds(
                Arrays.asList("S1"), range, true));
        collection.setXPosition(TimePeriodAnchor.END);
        assertNull(collection.getRangeBounds(Arrays.asList("S1"), range, true));
    }
}