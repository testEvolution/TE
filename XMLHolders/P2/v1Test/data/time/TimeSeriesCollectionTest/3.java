@Test
    public void testGetSurroundingItems() {
        TimeSeries series = new TimeSeries("Series 1");
        TimeSeriesCollection collection = new TimeSeriesCollection(series);
        collection.setXPosition(TimePeriodAnchor.MIDDLE);

        // for a series with no data, we expect {-1, -1}...
        int[] result = collection.getSurroundingItems(0, 1000L);
        assertTrue(result[0] == -1);
        assertTrue(result[1] == -1);

        // now test with a single value in the series...
        Day today = new Day();
        long start1 = today.getFirstMillisecond();
        long middle1 = today.getMiddleMillisecond();
        long end1 = today.getLastMillisecond();

        series.add(today, 99.9);
        result = collection.getSurroundingItems(0, start1);
        assertTrue(result[0] == -1);
        assertTrue(result[1] == 0);

        result = collection.getSurroundingItems(0, middle1);
        assertTrue(result[0] == 0);
        assertTrue(result[1] == 0);

        result = collection.getSurroundingItems(0, end1);
        assertTrue(result[0] == 0);
        assertTrue(result[1] == -1);

        // now add a second value to the series...
        Day tomorrow = (Day) today.next();
        long start2 = tomorrow.getFirstMillisecond();
        long middle2 = tomorrow.getMiddleMillisecond();
        long end2 = tomorrow.getLastMillisecond();

        series.add(tomorrow, 199.9);
        result = collection.getSurroundingItems(0, start2);
        assertTrue(result[0] == 0);
        assertTrue(result[1] == 1);

        result = collection.getSurroundingItems(0, middle2);
        assertTrue(result[0] == 1);
        assertTrue(result[1] == 1);

        result = collection.getSurroundingItems(0, end2);
        assertTrue(result[0] == 1);
        assertTrue(result[1] == -1);

        // now add a third value to the series...
        Day yesterday = (Day) today.previous();
        long start3 = yesterday.getFirstMillisecond();
        long middle3 = yesterday.getMiddleMillisecond();
        long end3 = yesterday.getLastMillisecond();

        series.add(yesterday, 1.23);
        result = collection.getSurroundingItems(0, start3);
        assertTrue(result[0] == -1);
        assertTrue(result[1] == 0);

        result = collection.getSurroundingItems(0, middle3);
        assertTrue(result[0] == 0);
        assertTrue(result[1] == 0);

        result = collection.getSurroundingItems(0, end3);
        assertTrue(result[0] == 0);
        assertTrue(result[1] == 1);
    }

    