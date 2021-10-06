@Test
    public void testBug25() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        GregorianCalendar cal = new GregorianCalendar(tz, Locale.UK);
        
        MyDateAxis axis = new MyDateAxis("25");
        axis.setTimeZone(tz);
        
        // YEAR
        DateTickUnit ydtu = new DateTickUnit(DateTickUnitType.YEAR, 5);
        Year y = new Year(2015);
        long ymillis = y.getFirstMillisecond(cal); // 1420070400000L
        Date yprev = axis.previousStandardDate(new Date(ymillis), ydtu);
        assertEquals(new Year(2010).getFirstMillisecond(cal), yprev.getTime());
        
        // MONTH 
        DateTickUnit mdtu = new DateTickUnit(DateTickUnitType.MONTH, 3);
        Month m = new Month(12, 2016);
        long mmillis = m.getFirstMillisecond(cal); 
        Date mprev = axis.previousStandardDate(new Date(mmillis), mdtu);
        assertEquals(new Month(9, 2016).getFirstMillisecond(cal), 
                mprev.getTime());
        
        // DAY
        DateTickUnit ddtu = new DateTickUnit(DateTickUnitType.DAY, 7);
        Day d = new Day(14, 1, 2016);
        long dmillis = d.getFirstMillisecond(cal); 
        Date dprev = axis.previousStandardDate(new Date(dmillis), ddtu);
        assertEquals(new Day(7, 1, 2016).getFirstMillisecond(cal), 
                dprev.getTime());
        
        // HOUR
        DateTickUnit hdtu = new DateTickUnit(DateTickUnitType.HOUR, 6);
        Hour h = new Hour(18, 24, 8, 2016);
        long hmillis = h.getFirstMillisecond(cal); 
        Date hprev = axis.previousStandardDate(new Date(hmillis), hdtu);
        assertEquals(new Hour(12, 24, 8, 2016).getFirstMillisecond(cal), 
                hprev.getTime());
        
        // MINUTE
        DateTickUnit mindtu = new DateTickUnit(DateTickUnitType.MINUTE, 5);
        Minute min = new Minute(10, 12, 24, 8, 2016);
        long minmillis = min.getFirstMillisecond(cal); // 1472040600000L GMT
        Date minprev = axis.previousStandardDate(new Date(minmillis), mindtu);
        assertEquals(1472040600000L - 5 * 60 * 1000L, minprev.getTime());
        
        // SECOND 
        DateTickUnit sdtu = new DateTickUnit(DateTickUnitType.SECOND, 10);
        Second s = new Second(50, 30, 18, 24, 8, 2016);
        long smillis = s.getFirstMillisecond(cal); 
        Date sprev = axis.previousStandardDate(new Date(smillis), sdtu);
        assertEquals(new Second(40, 30, 18, 24, 8, 2016)
                .getFirstMillisecond(cal), sprev.getTime());
        
        // MILLISECOND
        DateTickUnit msdtu = new DateTickUnit(DateTickUnitType.MILLISECOND, 10);
        Millisecond ms = new Millisecond(500, 50, 30, 18, 24, 8, 2016);
        long msmillis = ms.getFirstMillisecond(cal); 
        Date msprev = axis.previousStandardDate(new Date(msmillis), msdtu);
        assertEquals(new Millisecond(490, 50, 30, 18, 24, 8, 2016)
                .getFirstMillisecond(cal), msprev.getTime());
        
    }
    
}