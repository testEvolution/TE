@Test
    public void testEqualsSelf() {
        TimePeriodValue tpv = new TimePeriodValue(new Day(), 55.75);
        assertTrue(tpv.equals(tpv));
    }

    