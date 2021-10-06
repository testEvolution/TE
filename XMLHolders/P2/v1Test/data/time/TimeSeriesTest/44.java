@Test
    public void testFindValueRange2() {
        TimeZone tzone = TimeZone.getTimeZone("Europe/London");
        Calendar calendar = new GregorianCalendar(tzone, Locale.UK);
        calendar.clear();
        calendar.set(2014, Calendar.FEBRUARY, 23, 6, 0);
        long start = calendar.getTimeInMillis();
        calendar.clear();
        calendar.set(2014, Calendar.FEBRUARY, 24, 18, 0);
        long end = calendar.getTimeInMillis();
        Range range = new Range(start, end);
        
        TimeSeries ts = new TimeSeries("Time Series");
        assertNull(ts.findValueRange(range, TimePeriodAnchor.START, tzone));
        assertNull(ts.findValueRange(range, TimePeriodAnchor.MIDDLE, tzone));
        assertNull(ts.findValueRange(range, TimePeriodAnchor.END, tzone));
        
        ts.add(new Day(23, 2, 2014), 5.0);
        assertTrue(ts.findValueRange(range, TimePeriodAnchor.START, tzone).isNaNRange());
        assertEquals(new Range(5.0, 5.0), 
                ts.findValueRange(range, TimePeriodAnchor.MIDDLE, tzone));
        assertEquals(new Range(5.0, 5.0), 
                ts.findValueRange(range, TimePeriodAnchor.END, tzone));
        
        ts.add(new Day(24, 2, 2014), 6.0);
        assertEquals(new Range(6.0, 6.0), 
                ts.findValueRange(range, TimePeriodAnchor.START, tzone));
        assertEquals(new Range(5.0, 6.0), 
                ts.findValueRange(range, TimePeriodAnchor.MIDDLE, tzone));
        assertEquals(new Range(5.0, 5.0), 
                ts.findValueRange(range, TimePeriodAnchor.END, tzone));
        
        ts.clear();
        ts.add(new Day(24, 2, 2014), null);
        assertTrue(ts.findValueRange(range, TimePeriodAnchor.START, tzone).isNaNRange());
        assertTrue(ts.findValueRange(range, TimePeriodAnchor.MIDDLE, tzone).isNaNRange());
        assertTrue(ts.findValueRange(range, TimePeriodAnchor.END, tzone).isNaNRange());
    }
    
    