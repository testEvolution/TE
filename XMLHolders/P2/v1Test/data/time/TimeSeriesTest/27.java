@Test
    public void testRemoveAgedItems2() {
        long y2006 = 1157087372534L;  // milliseconds somewhere in 2006
        TimeSeries series = new TimeSeries("Test Series");
        series.addChangeListener(this);
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        this.gotSeriesChangeEvent = false;

        // test empty series
        series.removeAgedItems(y2006, true);
        assertEquals(0, series.getItemCount());
        assertFalse(this.gotSeriesChangeEvent);

        // test a series with 1 item
        series.add(new Year(2004), 1.0);
        series.setMaximumItemAge(1);
        this.gotSeriesChangeEvent = false;
        series.removeAgedItems(new Year(2005).getMiddleMillisecond(), true);
        assertEquals(1, series.getItemCount());
        assertFalse(this.gotSeriesChangeEvent);
        series.removeAgedItems(y2006, true);
        assertEquals(0, series.getItemCount());
        assertTrue(this.gotSeriesChangeEvent);

        // test a series with two items
        series.setMaximumItemAge(2);
        series.add(new Year(2003), 1.0);
        series.add(new Year(2005), 2.0);
        assertEquals(2, series.getItemCount());
        this.gotSeriesChangeEvent = false;
        assertEquals(2, series.getItemCount());

        series.removeAgedItems(new Year(2005).getMiddleMillisecond(), true);
        assertEquals(2, series.getItemCount());
        assertFalse(this.gotSeriesChangeEvent);
        series.removeAgedItems(y2006, true);
        assertEquals(1, series.getItemCount());
        assertTrue(this.gotSeriesChangeEvent);
    }

    