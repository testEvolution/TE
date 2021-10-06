@Test
    public void testCreateCopy2() {
        TimeSeries series = new TimeSeries("Series");
        series.add(new Month(MonthConstants.JANUARY, 2003), 45.0);
        series.add(new Month(MonthConstants.FEBRUARY, 2003), 55.0);
        series.add(new Month(MonthConstants.JUNE, 2003), 35.0);
        series.add(new Month(MonthConstants.NOVEMBER, 2003), 85.0);
        series.add(new Month(MonthConstants.DECEMBER, 2003), 75.0);

        try {
            // copy just the first item...
            TimeSeries result1 = series.createCopy(0, 0);
            assertEquals(new Month(1, 2003), result1.getTimePeriod(0));

            // copy the first two items...
            result1 = series.createCopy(0, 1);
            assertEquals(new Month(2, 2003), result1.getTimePeriod(1));

            // copy the middle three items...
            result1 = series.createCopy(1, 3);
            assertEquals(new Month(2, 2003), result1.getTimePeriod(0));
            assertEquals(new Month(11, 2003), result1.getTimePeriod(2));

            // copy the last two items...
            result1 = series.createCopy(3, 4);
            assertEquals(new Month(11, 2003), result1.getTimePeriod(0));
            assertEquals(new Month(12, 2003), result1.getTimePeriod(1));

            // copy the last item...
            result1 = series.createCopy(4, 4);
            assertEquals(new Month(12, 2003), result1.getTimePeriod(0));
        }
        catch (CloneNotSupportedException e) {
            assertTrue(false);
        }

        // check negative first argument
        boolean pass = false;
        try {
            /* TimeSeries result = */ series.createCopy(-1, 1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        catch (CloneNotSupportedException e) {
            pass = false;
        }
        assertTrue(pass);

        // check second argument less than first argument
        pass = false;
        try {
            /* TimeSeries result = */ series.createCopy(1, 0);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        catch (CloneNotSupportedException e) {
            pass = false;
        }
        assertTrue(pass);

        TimeSeries series2 = new TimeSeries("Series 2");
        try {
            TimeSeries series3 = series2.createCopy(99, 999);
            assertEquals(0, series3.getItemCount());
        }
        catch (CloneNotSupportedException e) {
            assertTrue(false);
        }
    }

    