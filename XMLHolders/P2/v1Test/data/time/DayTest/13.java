@Test
    public void test1Jan1900Previous() {
        Day jan1st1900 = new Day(1, MonthConstants.JANUARY, 1900);
        Day previous = (Day) jan1st1900.previous();
        assertNull(previous);
    }

    