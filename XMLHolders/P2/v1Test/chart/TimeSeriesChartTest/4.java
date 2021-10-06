private static JFreeChart createChart() {
        XYSeries series1 = new XYSeries("Series 1");
        series1.add(1.0, 1.0);
        series1.add(2.0, 2.0);
        series1.add(3.0, 3.0);
        XYDataset dataset = new XYSeriesCollection(series1);
        return ChartFactory.createTimeSeriesChart(
            "XY Line Chart",  // chart title
            "Domain",
            "Range",
            dataset,         // data
            true,            // include legend
            true,            // tooltips
            true             // urls
        );

    }

    