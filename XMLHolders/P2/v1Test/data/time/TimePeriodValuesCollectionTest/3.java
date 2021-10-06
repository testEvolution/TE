@Test
    public void testGetSeries() {
        TimePeriodValuesCollection c1 = new TimePeriodValuesCollection();
        TimePeriodValues s1 = new TimePeriodValues("Series 1");
        c1.addSeries(s1);
        assertEquals("Series 1", c1.getSeries(0).getKey());
        
        boolean pass = false;
        try {
            c1.getSeries(-1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
        
        pass = false;
        try {
            c1.getSeries(1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }
    
    