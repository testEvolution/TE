@Test
    public void testRemoveAgedItems() {
        TimeSeries series = new TimeSeries("Test Series");
        series.addChangeListener(this);
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        this.gotSeriesChangeEvent = false;

        // test empty series
        series.removeAgedItems(true);
        assertEquals(0, series.getItemCount());
        assertFalse(this.gotSeriesChangeEvent);

        // test series with one item
        series.add(new Year(1999), 1.0);
        series.setMaximumItemAge(0);
        this.gotSeriesChangeEvent = false;
        series.removeAgedItems(true);
        assertEquals(1, series.getItemCount());
        assertFalse(this.gotSeriesChangeEvent);

        // test series with two items
        series.setMaximumItemAge(10);
        series.add(new Year(2001), 2.0);
        this.gotSeriesChangeEvent = false;
        series.setMaximumItemAge(2);
        assertEquals(2, series.getItemCount());
        assertEquals(0, series.getIndex(new Year(1999)));
        assertFalse(this.gotSeriesChangeEvent);
        series.setMaximumItemAge(1);
        assertEquals(1, series.getItemCount());
        assertEquals(0, series.getIndex(new Year(2001)));
        assertTrue(this.gotSeriesChangeEvent);
    }

    