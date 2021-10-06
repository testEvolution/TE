private static JFreeChart createChart() {
        XYSeries series1 = new XYSeries("Series 1");
        series1.add(1.0, 1.0);
        series1.add(2.0, 2.0);
        series1.add(3.0, 3.0);
        IntervalXYDataset dataset = new XYBarDataset(new XYSeriesCollection(
                series1), 1.0);
        return ChartFactory.createXYBarChart("XY Bar Chart", "Domain", false,
                "Range", dataset);

    }

    