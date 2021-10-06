private XYDataset createXYDataset1() {
        XYSeries series1 = new XYSeries("S1");
        series1.add(1.0, 100.0);
        series1.add(2.0, 101.0);
        series1.add(3.0, 102.0);
        XYSeries series2 = new XYSeries("S2");
        series2.add(1.0, 103.0);
        series2.add(2.0, null);
        series2.add(3.0, 105.0);
        XYSeriesCollection result = new XYSeriesCollection();
        result.addSeries(series1);
        result.addSeries(series2);
        result.setIntervalWidth(0.0);
        return result;
    }

    