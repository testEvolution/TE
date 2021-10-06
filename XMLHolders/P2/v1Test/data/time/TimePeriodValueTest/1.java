@Test
    public void testEquals() {
        TimePeriodValue tpv1 = new TimePeriodValue(new Day(30, 7, 2003), 55.75);
        TimePeriodValue tpv2 = new TimePeriodValue(new Day(30, 7, 2003), 55.75);
        assertTrue(tpv1.equals(tpv2));
        assertTrue(tpv2.equals(tpv1));
    }

    