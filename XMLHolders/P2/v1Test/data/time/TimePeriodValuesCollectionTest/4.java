@Test
    public void testGetDomainBoundsWithoutInterval() {
        // check empty dataset
        TimePeriodValuesCollection dataset = new TimePeriodValuesCollection();
        Range r = dataset.getDomainBounds(false);
        assertNull(r);
        
        // check dataset with one time period
        TimePeriodValues s1 = new TimePeriodValues("S1");
        s1.add(new SimpleTimePeriod(1000L, 2000L), 1.0);
        dataset.addSeries(s1);
        r = dataset.getDomainBounds(false);
        assertEquals(1500.0, r.getLowerBound(), EPSILON);
        assertEquals(1500.0, r.getUpperBound(), EPSILON);
        
        // check dataset with two time periods
        s1.add(new SimpleTimePeriod(1500L, 3000L), 2.0);
        r = dataset.getDomainBounds(false);
        assertEquals(1500.0, r.getLowerBound(), EPSILON);
        assertEquals(2250.0, r.getUpperBound(), EPSILON);  
    }

    