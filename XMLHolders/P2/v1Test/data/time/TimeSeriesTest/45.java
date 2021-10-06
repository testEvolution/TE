@Test
    public void testFindValueRange3() {
        TimeZone tzone = TimeZone.getTimeZone("Europe/London");
        Calendar calendar = new GregorianCalendar(tzone, Locale.UK);
        calendar.clear();
        calendar.set(2015, Calendar.SEPTEMBER, 1, 6, 0);
        long start = calendar.getTimeInMillis();
        calendar.clear();
        calendar.set(2015, Calendar.SEPTEMBER, 30, 18, 0);
        long end = calendar.getTimeInMillis();
        Range range = new Range(start, end);
        
        TimeSeries ts = new TimeSeries("Time Series");
        assertNull(ts.findValueRange(range, TimePeriodAnchor.START, tzone));
        assertNull(ts.findValueRange(range, TimePeriodAnchor.MIDDLE, tzone));
        assertNull(ts.findValueRange(range, TimePeriodAnchor.END, tzone));
        
        ts.add(new Day(1, 9, 2015), 1.0);
        ts.add(new Day(2, 9, 2015), 99.0);
        ts.add(new Day(30, 9, 2015), 2.0);

        assertEquals(new Range(2.0, 99.0), 
                ts.findValueRange(range, TimePeriodAnchor.START, tzone));
        assertEquals(new Range(1.0, 99.0), 
                ts.findValueRange(range, TimePeriodAnchor.MIDDLE, tzone));
        assertEquals(new Range(1.0, 99.0), 
                ts.findValueRange(range, TimePeriodAnchor.END, tzone));
        
        ts.add(new Day(10, 9, 2015), Double.NaN);
        assertEquals(new Range(2.0, 99.0), 
                ts.findValueRange(range, TimePeriodAnchor.START, tzone));
        assertEquals(new Range(1.0, 99.0), 
                ts.findValueRange(range, TimePeriodAnchor.MIDDLE, tzone));
        assertEquals(new Range(1.0, 99.0), 
                ts.findValueRange(range, TimePeriodAnchor.END, tzone));

    }
}