private IntervalXYDataset createDataset1() {

        // create dataset 1...
        TimeSeries series1 = new TimeSeries("Series 1");
        series1.add(new Day(1, MonthConstants.MARCH, 2002), 12353.3);
        series1.add(new Day(2, MonthConstants.MARCH, 2002), 13734.4);
        series1.add(new Day(3, MonthConstants.MARCH, 2002), 14525.3);
        series1.add(new Day(4, MonthConstants.MARCH, 2002), 13984.3);
        series1.add(new Day(5, MonthConstants.MARCH, 2002), 12999.4);
        series1.add(new Day(6, MonthConstants.MARCH, 2002), 14274.3);
        series1.add(new Day(7, MonthConstants.MARCH, 2002), 15943.5);
        series1.add(new Day(8, MonthConstants.MARCH, 2002), 14845.3);
        series1.add(new Day(9, MonthConstants.MARCH, 2002), 14645.4);
        series1.add(new Day(10, MonthConstants.MARCH, 2002), 16234.6);
        series1.add(new Day(11, MonthConstants.MARCH, 2002), 17232.3);
        series1.add(new Day(12, MonthConstants.MARCH, 2002), 14232.2);
        series1.add(new Day(13, MonthConstants.MARCH, 2002), 13102.2);
        series1.add(new Day(14, MonthConstants.MARCH, 2002), 14230.2);
        series1.add(new Day(15, MonthConstants.MARCH, 2002), 11235.2);

        TimeSeriesCollection collection = new TimeSeriesCollection(series1);
        return collection;

    }

    