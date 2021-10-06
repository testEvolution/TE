@Test
    public void test1161329() {
        TimePeriodValues tpv = new TimePeriodValues("Test");
        RegularTimePeriod t = new Day();
        tpv.add(t, 1.0);
        t = t.next();
        tpv.add(t, 2.0);
        tpv.delete(0, 1);
        assertEquals(0, tpv.getItemCount());
        tpv.add(t, 2.0);
        assertEquals(1, tpv.getItemCount());
    }
    
    