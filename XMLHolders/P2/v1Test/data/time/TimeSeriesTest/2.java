@Test
    public void testClone() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test Series");
        RegularTimePeriod jan1st2002 = new Day(1, MonthConstants.JANUARY, 2002);
        series.add(jan1st2002, 42);

        TimeSeries clone;
        clone = (TimeSeries) series.clone();
        clone.setKey("Clone Series");
        clone.update(jan1st2002, 10);

        int seriesValue = series.getValue(jan1st2002).intValue();
        int cloneValue = clone.getValue(jan1st2002).intValue();

        assertEquals(42, seriesValue);
        assertEquals(10, cloneValue);
        assertEquals("Test Series", series.getKey());
        assertEquals("Clone Series", clone.getKey());
    }

    