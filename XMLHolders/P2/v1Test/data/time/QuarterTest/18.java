@Test
    public void testParseQuarter() {

        Quarter quarter = null;

        // test 1...
        try {
            quarter = Quarter.parseQuarter("Q1-2000");
        }
        catch (TimePeriodFormatException e) {
            quarter = new Quarter(1, 1900);
        }
        assertEquals(1, quarter.getQuarter());
        assertEquals(2000, quarter.getYear().getYear());

        // test 2...
        try {
            quarter = Quarter.parseQuarter("2001-Q2");
        }
        catch (TimePeriodFormatException e) {
            quarter = new Quarter(1, 1900);
        }
        assertEquals(2, quarter.getQuarter());
        assertEquals(2001, quarter.getYear().getYear());

        // test 3...
        try {
            quarter = Quarter.parseQuarter("Q3, 2002");
        }
        catch (TimePeriodFormatException e) {
            quarter = new Quarter(1, 1900);
        }
        assertEquals(3, quarter.getQuarter());
        assertEquals(2002, quarter.getYear().getYear());

    }

    