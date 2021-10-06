@Test
    public void testAdd() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        MySeriesChangeListener listener = new MySeriesChangeListener();
        tpv.addChangeListener(listener);
        tpv.add(new TimePeriodValue(new SimpleTimePeriod(new Date(1L), 
                new Date(3L)), 99.0));
        assertEquals(99.0, tpv.getValue(0).doubleValue(), EPSILON);
        assertEquals(tpv, listener.getLastEvent().getSource());
        
        // a null item should throw an IllegalArgumentException
        boolean pass = false;
        try {
            tpv.add((TimePeriodValue) null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }
    
    