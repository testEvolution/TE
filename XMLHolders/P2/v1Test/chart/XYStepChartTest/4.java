private static JFreeChart createChart() {

        // create a dataset...
        XYSeries series1 = new XYSeries("Series 1");
        series1.add(1.0, 1.0);
        series1.add(2.0, 2.0);
        series1.add(3.0, 3.0);
        XYDataset dataset = new XYSeriesCollection(series1);

        // create the chart...
        return ChartFactory.createXYStepChart(
            "Step Chart",  // chart title
            "Domain",
            "Range",
            dataset,         // data
            PlotOrientation.VERTICAL,
            true,            // include legend
            true,            // tooltips
            true             // urls
        );

    }

    