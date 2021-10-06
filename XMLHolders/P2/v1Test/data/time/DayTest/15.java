@Test
    public void test31Dec9999Previous() {
        Day dec31st9999 = new Day(31, MonthConstants.DECEMBER, 9999);
        Day previous = (Day) dec31st9999.previous();
        assertEquals(30, previous.getDayOfMonth());
    }

    