private TimeSeries createDailyTimeSeries1() {
        TimeSeries series = new TimeSeries("Series 1");
        series.add(new Day(11, MonthConstants.AUGUST, 2003), 11.2);
        series.add(new Day(13, MonthConstants.AUGUST, 2003), 13.8);
        series.add(new Day(17, MonthConstants.AUGUST, 2003), 14.1);
        series.add(new Day(18, MonthConstants.AUGUST, 2003), 12.7);
        series.add(new Day(19, MonthConstants.AUGUST, 2003), 16.5);
        series.add(new Day(20, MonthConstants.AUGUST, 2003), 15.6);
        series.add(new Day(25, MonthConstants.AUGUST, 2003), 19.8);
        series.add(new Day(27, MonthConstants.AUGUST, 2003), 10.7);
        series.add(new Day(28, MonthConstants.AUGUST, 2003), 14.3);
        return series;
    }

}