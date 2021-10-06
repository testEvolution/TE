@Test
    public void testEquals() {
        
        TimePeriodValuesCollection c1 = new TimePeriodValuesCollection();
        TimePeriodValuesCollection c2 = new TimePeriodValuesCollection();
        assertTrue(c1.equals(c2));
        
        c1.setXPosition(TimePeriodAnchor.END);
        assertFalse(c1.equals(c2));
        c2.setXPosition(TimePeriodAnchor.END);
        assertTrue(c1.equals(c2));
        
        TimePeriodValues v1 = new TimePeriodValues("Test");
        TimePeriodValues v2 = new TimePeriodValues("Test");
        
        c1.addSeries(v1);
        assertFalse(c1.equals(c2));
        c2.addSeries(v2);
        assertTrue(c1.equals(c2));
    }

    