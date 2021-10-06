@Test
    public void testGetDataItem1() {
        TimeSeries series = new TimeSeries("S");

        // can't get anything yet...just an exception
        boolean pass = false;
        try {
            /*TimeSeriesDataItem item =*/ series.getDataItem(0);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);

        series.add(new Year(2006), 100.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        assertEquals(new Year(2006), item.getPeriod());
        pass = false;
        try {
            /*item = */series.getDataItem(-1);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            /*item = */series.getDataItem(1);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    