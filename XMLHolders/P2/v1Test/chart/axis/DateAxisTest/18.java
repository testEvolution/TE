@Test
    public void testPreviousStandardDateHourB() {
        MyDateAxis axis = new MyDateAxis("Hour");
        Hour h0 = new Hour(12, 1, 4, 2007);
        Hour h1 = new Hour(13, 1, 4, 2007);

        // five dates to check...
        Date d0 = new Date(h0.getFirstMillisecond());
        Date d1 = new Date(h0.getFirstMillisecond() + 500L);
        Date d2 = new Date(h0.getMiddleMillisecond());
        Date d3 = new Date(h0.getMiddleMillisecond() + 500L);
        Date d4 = new Date(h0.getLastMillisecond());

        Date end = new Date(h1.getLastMillisecond());

        DateTickUnit unit = new DateTickUnit(DateTickUnitType.HOUR, 6);
        axis.setTickUnit(unit);

        // START: check d0 and d1
        axis.setTickMarkPosition(DateTickMarkPosition.START);

        axis.setRange(d0, end);
        Date psd = axis.previousStandardDate(d0, unit);
        Date nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d0.getTime());
        assertTrue(nsd.getTime() >= d0.getTime());

        axis.setRange(d1, end);
        psd = axis.previousStandardDate(d1, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d1.getTime());
        assertTrue(nsd.getTime() >= d1.getTime());

        // MIDDLE: check d1, d2 and d3
        axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE);

        axis.setRange(d1, end);
        psd = axis.previousStandardDate(d1, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d1.getTime());
        assertTrue(nsd.getTime() >= d1.getTime());

        axis.setRange(d2, end);
        psd = axis.previousStandardDate(d2, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d2.getTime());
        assertTrue(nsd.getTime() >= d2.getTime());

        axis.setRange(d3, end);
        psd = axis.previousStandardDate(d3, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d3.getTime());
        assertTrue(nsd.getTime() >= d3.getTime());

        // END: check d3 and d4
        axis.setTickMarkPosition(DateTickMarkPosition.END);

        axis.setRange(d3, end);
        psd = axis.previousStandardDate(d3, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d3.getTime());
        assertTrue(nsd.getTime() >= d3.getTime());

        axis.setRange(d4, end);
        psd = axis.previousStandardDate(d4, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d4.getTime());
        assertTrue(nsd.getTime() >= d4.getTime());
    }

    