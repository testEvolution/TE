@Test
    public void testEquals() {
        Hour hour1 = new Hour(15, new Day(29, MonthConstants.MARCH, 2002));
        Hour hour2 = new Hour(15, new Day(29, MonthConstants.MARCH, 2002));
        assertTrue(hour1.equals(hour2));
    }

    