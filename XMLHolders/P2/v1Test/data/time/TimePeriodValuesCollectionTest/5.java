@Test 
    public void testGetDomainBoundsWithInterval() {
        // check empty dataset
        TimePeriodValuesCollection dataset = new TimePeriodValuesCollection();
        Range r = dataset.getDomainBounds(true);
        assertNull(r);
        
        // check dataset with one time period
        TimePeriodValues s1 = new TimePeriodValues("S1");
        s1.add(new SimpleTimePeriod(1000L, 2000L), 1.0);
        dataset.addSeries(s1);
        r = dataset.getDomainBounds(true);
        assertEquals(1000.0, r.getLowerBound(), EPSILON);
        assertEquals(2000.0, r.getUpperBound(), EPSILON);
        
        // check dataset with two time periods
        s1.add(new SimpleTimePeriod(1500L, 3000L), 2.0);
        r = dataset.getDomainBounds(true);
        assertEquals(1000.0, r.getLowerBound(), EPSILON);
        assertEquals(3000.0, r.getUpperBound(), EPSILON);
        
        // add a third time period
        s1.add(new SimpleTimePeriod(6000L, 7000L), 1.5);
        r = dataset.getDomainBounds(true);
        assertEquals(1000.0, r.getLowerBound(), EPSILON);
        assertEquals(7000.0, r.getUpperBound(), EPSILON);

        // add a fourth time period
        s1.add(new SimpleTimePeriod(4000L, 5000L), 1.4);
        r = dataset.getDomainBounds(true);
        assertEquals(1000.0, r.getLowerBound(), EPSILON);
        assertEquals(7000.0, r.getUpperBound(), EPSILON);    
    }
}