@Test
    public void testSerialization() {
        QuarterDateFormat qf1 = new QuarterDateFormat(TimeZone.getTimeZone(
                "GMT"), new String[] {"1", "2", "3", "4"});
        QuarterDateFormat qf2 = (QuarterDateFormat) TestUtils.serialised(qf1);
        assertEquals(qf1, qf2);
    }

}