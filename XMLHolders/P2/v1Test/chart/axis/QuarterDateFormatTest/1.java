@Test
    public void testHashCode() {
        QuarterDateFormat qf1 = new QuarterDateFormat(TimeZone.getTimeZone(
                "GMT"), new String[] {"1", "2", "3", "4"});
        QuarterDateFormat qf2 = new QuarterDateFormat(TimeZone.getTimeZone(
                "GMT"), new String[] {"1", "2", "3", "4"});
        assertTrue(qf1.equals(qf2));
        int h1 = qf1.hashCode();
        int h2 = qf2.hashCode();
        assertEquals(h1, h2);
    }

    