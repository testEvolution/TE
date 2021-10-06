public static XYSeriesCollection createTestXYSeriesCollection() {
        XYSeriesCollection result = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Series 1", false, false);
        series1.add(1.0, 2.0);
        series1.add(2.0, 5.0);
        XYSeries series2 = new XYSeries("Series 2", false, false);
        series2.add(1.0, 4.0);
        series2.add(2.0, 3.0);
        result.addSeries(series1);
        result.addSeries(series2);
        return result;
    }

    