@Test
    public void testEquals() {
        TimePeriodValues s1 = new TimePeriodValues("Time Series 1");
        TimePeriodValues s2 = new TimePeriodValues("Time Series 2");
        boolean b1 = s1.equals(s2);
        assertFalse(b1, "b1");

        s2.setKey("Time Series 1");
        boolean b2 = s1.equals(s2);
        assertTrue(b2, "b2");

        // domain description
        s1.setDomainDescription("XYZ");
        assertFalse(s1.equals(s2));
        s2.setDomainDescription("XYZ");
        assertTrue(s1.equals(s2));
        
        // domain description - null
        s1.setDomainDescription(null);
        assertFalse(s1.equals(s2));
        s2.setDomainDescription(null);
        assertTrue(s1.equals(s2));
        
        // range description
        s1.setRangeDescription("XYZ");
        assertFalse(s1.equals(s2));
        s2.setRangeDescription("XYZ");
        assertTrue(s1.equals(s2));
        
        // range description - null
        s1.setRangeDescription(null);
        assertFalse(s1.equals(s2));
        s2.setRangeDescription(null);
        assertTrue(s1.equals(s2));

        RegularTimePeriod p1 = new Day();
        RegularTimePeriod p2 = p1.next();
        s1.add(p1, 100.0);
        s1.add(p2, 200.0);
        boolean b3 = s1.equals(s2);
        assertFalse(b3, "b3");

        s2.add(p1, 100.0);
        s2.add(p2, 200.0);
        boolean b4 = s1.equals(s2);
        assertTrue(b4, "b4");

    }
    
    