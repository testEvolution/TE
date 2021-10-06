private static JFreeChart createAreaChart() {
        Number[][] data = new Integer[][] {{-3, -2}, {-1, 1}, {2, 3}};
        CategoryDataset dataset = DatasetUtils.createCategoryDataset("S",
                "C", data);
        return ChartFactory.createAreaChart("Area Chart", "Domain", "Range",
                dataset, PlotOrientation.HORIZONTAL, true, true, true);

    }

    