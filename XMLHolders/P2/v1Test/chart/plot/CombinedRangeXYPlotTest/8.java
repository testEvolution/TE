private CombinedRangeXYPlot createPlot() {
        // create subplot 1...
        XYDataset data1 = createDataset1();
        XYItemRenderer renderer1 = new StandardXYItemRenderer();
        NumberAxis xAxis1 = new NumberAxis("X1");
        XYPlot subplot1 = new XYPlot(data1, xAxis1, null, renderer1);
        subplot1.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

        XYTextAnnotation annotation
                = new XYTextAnnotation("Hello!", 50.0, 10000.0);
        annotation.setFont(new Font("SansSerif", Font.PLAIN, 9));
        annotation.setRotationAngle(Math.PI / 4.0);
        subplot1.addAnnotation(annotation);

        // create subplot 2...
        XYDataset data2 = createDataset2();
        XYItemRenderer renderer2 = new StandardXYItemRenderer();
        NumberAxis xAxis2 = new NumberAxis("X2");
        xAxis2.setAutoRangeIncludesZero(false);
        XYPlot subplot2 = new XYPlot(data2, xAxis2, null, renderer2);
        subplot2.setRangeAxisLocation(AxisLocation.TOP_OR_LEFT);

        // parent plot...
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot(new NumberAxis(
                "Range"));
        plot.setGap(10.0);

        // add the subplots...
        plot.add(subplot1, 1);
        plot.add(subplot2, 1);
        plot.setOrientation(PlotOrientation.VERTICAL);
        return plot;
    }

}