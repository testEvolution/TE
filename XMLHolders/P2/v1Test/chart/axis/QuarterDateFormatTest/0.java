@Test
    public void testEquals() {
        QuarterDateFormat qf1 = new QuarterDateFormat(TimeZone.getTimeZone(
                "GMT"), new String[] {"1", "2", "3", "4"});
        QuarterDateFormat qf2 = new QuarterDateFormat(TimeZone.getTimeZone(
                "GMT"), new String[] {"1", "2", "3", "4"});
        assertTrue(qf1.equals(qf2));
        assertTrue(qf2.equals(qf1));

        qf1 = new QuarterDateFormat(TimeZone.getTimeZone("PST"),
                new String[] {"1", "2", "3", "4"});
        assertFalse(qf1.equals(qf2));
        qf2 = new QuarterDateFormat(TimeZone.getTimeZone("PST"),
                new String[] {"1", "2", "3", "4"});
        assertTrue(qf1.equals(qf2));

        qf1 = new QuarterDateFormat(TimeZone.getTimeZone("PST"),
                new String[] {"A", "2", "3", "4"});
        assertFalse(qf1.equals(qf2));
        qf2 = new QuarterDateFormat(TimeZone.getTimeZone("PST"),
                new String[] {"A", "2", "3", "4"});
        assertTrue(qf1.equals(qf2));

        qf1 = new QuarterDateFormat(TimeZone.getTimeZone("PST"),
                new String[] {"A", "2", "3", "4"}, true);
        assertFalse(qf1.equals(qf2));
        qf2 = new QuarterDateFormat(TimeZone.getTimeZone("PST"),
                new String[] {"A", "2", "3", "4"}, true);
        assertTrue(qf1.equals(qf2));
    }

    