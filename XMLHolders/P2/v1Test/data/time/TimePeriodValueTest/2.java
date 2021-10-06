@Test
    public void testSerialization() {
        TimePeriodValue tpv1 = new TimePeriodValue(new Day(30, 7, 2003), 55.75);
        TimePeriodValue tpv2 = (TimePeriodValue) TestUtils.serialised(tpv1);
        assertEquals(tpv1, tpv2);
    }

}