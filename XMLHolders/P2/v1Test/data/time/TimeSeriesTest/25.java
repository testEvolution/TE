@Test
    public void testGetDataItem2() {
        TimeSeries series = new TimeSeries("S");
        assertNull(series.getDataItem(new Year(2006)));

        // try a null argument
        boolean pass = false;
        try {
            /* TimeSeriesDataItem item = */ series.getDataItem(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    