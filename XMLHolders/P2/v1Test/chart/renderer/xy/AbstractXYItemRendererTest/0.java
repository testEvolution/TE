private XYDataset createDataset1() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    