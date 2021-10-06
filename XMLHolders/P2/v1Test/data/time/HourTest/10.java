@Test
    public void testFirstHourPrevious() {
        Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900));
        Hour previous = (Hour) first.previous();
        assertNull(previous);
    }

    