@Test
    public void test31Dec9999Next() {
        Day dec31st9999 = new Day(31, MonthConstants.DECEMBER, 9999);
        Day next = (Day) dec31st9999.next();
        assertNull(next);
    }

    