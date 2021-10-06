@Test
    public void testParseYear() {

        Year year = null;

        // test 1...
        try {
            year = Year.parseYear("2000");
        }
        catch (TimePeriodFormatException e) {
            year = new Year(1900);
        }
        assertEquals(2000, year.getYear());

        // test 2...
        try {
            year = Year.parseYear(" 2001 ");
        }
        catch (TimePeriodFormatException e) {
            year = new Year(1900);
        }
        assertEquals(2001, year.getYear());

        // test 3...
        try {
            year = Year.parseYear("99");
        }
        catch (TimePeriodFormatException e) {
            year = new Year(1900);
        }
        assertEquals(99, year.getYear());

    }

    