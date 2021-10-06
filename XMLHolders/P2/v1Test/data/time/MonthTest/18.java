@Test
    public void testParseMonth() {
        Month month = null;

        // test 1...
        try {
            month = Month.parseMonth("1990-01");
        }
        catch (TimePeriodFormatException e) {
            month = new Month(1, 1900);
        }
        assertEquals(1, month.getMonth());
        assertEquals(1990, month.getYear().getYear());

        // test 2...
        try {
            month = Month.parseMonth("02-1991");
        }
        catch (TimePeriodFormatException e) {
            month = new Month(1, 1900);
        }
        assertEquals(2, month.getMonth());
        assertEquals(1991, month.getYear().getYear());

        // test 3...
        try {
            String monthName = SerialDate.DATE_FORMAT_SYMBOLS.getMonths()[2];
            month = Month.parseMonth(monthName + " 1993");
        }
        catch (TimePeriodFormatException e) {
            month = new Month(1, 1900);
        }
        assertEquals(3, month.getMonth());
        assertEquals(1993, month.getYear().getYear());

    }

    