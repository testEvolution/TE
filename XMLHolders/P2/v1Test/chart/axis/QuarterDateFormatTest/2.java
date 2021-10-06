@Test
    public void testCloning() {
        QuarterDateFormat qf1 = new QuarterDateFormat(TimeZone.getTimeZone(
                "GMT"), new String[] {"1", "2", "3", "4"});
        QuarterDateFormat qf2 = null;
        qf2 = (QuarterDateFormat) qf1.clone();
        assertTrue(qf1 != qf2);
        assertTrue(qf1.getClass() == qf2.getClass());
        assertTrue(qf1.equals(qf2));
    }

    