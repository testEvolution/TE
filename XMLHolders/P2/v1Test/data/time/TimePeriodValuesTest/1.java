@Test
    public void testClone() throws CloneNotSupportedException {
        TimePeriodValues series = new TimePeriodValues("Test Series");
        RegularTimePeriod jan1st2002 = new Day(1, MonthConstants.JANUARY, 2002);
        series.add(jan1st2002, 42);
        TimePeriodValues clone = (TimePeriodValues) series.clone();
        clone.setKey("Clone Series");
        clone.update(0, 10);

        int seriesValue = series.getValue(0).intValue();
        int cloneValue = clone.getValue(0).intValue();

        assertEquals(42, seriesValue);
        assertEquals(10, cloneValue);
        assertEquals("Test Series", series.getKey());
        assertEquals("Clone Series", clone.getKey());
    }

    