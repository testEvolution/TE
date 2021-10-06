@Test
    public void testPreviousStandardDateMillisecondB() {
        MyDateAxis axis = new MyDateAxis("Millisecond");
        Millisecond m0 = new Millisecond(458, 58, 31, 12, 1, 4, 2007);
        Millisecond m1 = new Millisecond(459, 58, 31, 12, 1, 4, 2007);

        Date d0 = new Date(m0.getFirstMillisecond());
        Date end = new Date(m1.getLastMillisecond());

        DateTickUnit unit = new DateTickUnit(DateTickUnitType.MILLISECOND, 10);
        axis.setTickUnit(unit);

        // START: check d0
        axis.setTickMarkPosition(DateTickMarkPosition.START);

        axis.setRange(d0, end);
        Date psd = axis.previousStandardDate(d0, unit);
        Date nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d0.getTime());
        assertTrue(nsd.getTime() >= d0.getTime());

        // MIDDLE: check d0
        axis.setTickMarkPosition(DateTickMarkPosition.MIDDLE);

        axis.setRange(d0, end);
        psd = axis.previousStandardDate(d0, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d0.getTime());
        assertTrue(nsd.getTime() >= d0.getTime());

        // END: check d0
        axis.setTickMarkPosition(DateTickMarkPosition.END);

        axis.setRange(d0, end);
        psd = axis.previousStandardDate(d0, unit);
        nsd = unit.addToDate(psd, TimeZone.getDefault());
        assertTrue(psd.getTime() < d0.getTime());
        assertTrue(nsd.getTime() >= d0.getTime());
    }

    